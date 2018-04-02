package com.cloud.common.json;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;

public class JsonUtils {
    final static ObjectMapper objectMapper;

    static boolean isPretty = true;

    private static Logger log = LoggerFactory.getLogger(JsonUtils.class);

    static {
        objectMapper = new ObjectMapper();
        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        objectMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
    }

    public static ObjectMapper getObjectMapper(){
        return objectMapper;
    }

    public static <T> T json2GenericObject(InputStream is, TypeReference<T> tr){

        if (is==null){
            return null;
        }else{
            try {
                return (T) objectMapper.readValue(is,tr);
            }catch (Throwable t){
                log.error("json error :",t);
            }finally {
                if (is!=null){
                    try {
                        is.close();
                    }catch (IOException e){
                        if (log.isDebugEnabled()){
                            log.debug("json error:",e);
                        }
                    }
                }
            }
        }
        return null;
    }

    public static <T> T json2GenericObject(String content ,  TypeReference<T> tr){
        if (content==null ||"".equals(content.trim())){
            return null;
        }else{
            try{
                return (T)objectMapper.readValue(content,tr);
            }catch (Throwable t){
                log.error("json error:",t);
            }
        }
        return null;
    }

    public static String toJson (Object object){
        String jsonString = "";
        try{
            if (isPretty){
                jsonString=objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(object);
            }else{
                jsonString = objectMapper.writeValueAsString(object);
            }
        }catch (Exception e){
            log.error("json error :"+e.getMessage(),e);
        }
        return jsonString;
    }

}
