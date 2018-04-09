package com.cloud.manila.controllers;

import com.fasterxml.jackson.databind.JsonNode;

import javax.xml.transform.Result;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

import static play.mvc.Controller.request;

public class ManilaController {

    public CompletionStage<Result> queryManilaList(){
        JsonNode jsonNode = request().body().asJson();
    }
}
