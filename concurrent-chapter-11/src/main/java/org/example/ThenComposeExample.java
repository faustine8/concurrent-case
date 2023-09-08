package org.example;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;


@Slf4j
public class ThenComposeExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture cf=CompletableFuture.supplyAsync(()->"Compose Message")
                .thenCompose(r->CompletableFuture.supplyAsync(()->r.toUpperCase()));
        log.info("result:"+cf.get());
    }
}
