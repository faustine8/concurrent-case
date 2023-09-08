package org.example;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;


@Slf4j
public class ThenAcceptBothExample {
    public static void main(String[] args) {
        /*CompletableFuture<String> task1=CompletableFuture.supplyAsync(()->"AcceptBoth");
        CompletableFuture<String> task2=CompletableFuture.supplyAsync(()->"message");
        task1.thenAcceptBoth(task2,(r1,r2)->{
            log.info("result:"+(r1+" "+r2));
        });*/
        CompletableFuture.supplyAsync(()->"AcceptBoth").thenAcceptBoth(CompletableFuture.supplyAsync(()->"message"),(r1,r2)->{
            log.info("result:"+(r1+" "+r2));
        });
    }
}
