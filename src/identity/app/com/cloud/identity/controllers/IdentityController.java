package com.cloud.identity.controllers;

import play.mvc.Controller;
import play.mvc.Result;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

public class IdentityController extends Controller {

    public CompletionStage<Result> login(){
        return CompletableFuture.supplyAsync(()->ok());
    }

}
