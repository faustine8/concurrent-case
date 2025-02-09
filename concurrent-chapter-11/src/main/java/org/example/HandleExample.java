package org.example;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;


@Slf4j
public class HandleExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture cf=CompletableFuture
                .supplyAsync(()->{throw new RuntimeException("Occur Exception");})
                .handleAsync((r,th)->{
                    return th;
                });
        log.info((String) cf.get());
    }
}
