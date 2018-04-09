package com.cloud.common.system;

import javax.inject.Singleton;
import java.util.Optional;

@Singleton
public class SystemSetting {

    public String bindAddress(){
        return System.getProperty("bind","127.0.0.1");
    }

    public int bindingPort(){
        return this.httpsPort().orElseGet(()->this.httpPort().orElse(9000));
    }

    public Optional<Integer> httpsPort(){
        return Optional.ofNullable(System.getProperty("http.port")).map(Integer::valueOf);
    }
    public Optional<Integer> httpPort(){
        return Optional.ofNullable(System.getProperty("http.port")).map(Integer::valueOf);
    }

    public String bindingProtocol(){
        return this.httpsPort().map(x->"https").orElse("http");
    }
    public  String httpPrefix(){
        int port = 9000;
        return String.format("%s://%s%s","http",bindAddress(),port ==80? "":":"+port);
    }
}
