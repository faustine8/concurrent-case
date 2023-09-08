package org.example;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;


@Slf4j
public class RunAfterBothExample {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture cf=CompletableFuture.supplyAsync(()-> {
            throw new RuntimeException("occur exception");
        }).runAfterBoth(CompletableFuture.supplyAsync(()->"Message"),()-> log.info("Done"));
        log.info("result:"+cf.get());
    }
}
