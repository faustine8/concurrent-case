package org.example;

import java.util.concurrent.atomic.AtomicInteger;


public class CasExample {

    public AtomicInteger atomicInteger=new AtomicInteger(0);
    public void add(){
        atomicInteger.getAndIncrement();
    }
}
