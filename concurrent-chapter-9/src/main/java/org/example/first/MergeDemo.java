package org.example.first;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.stream.Stream;


public class MergeDemo {


    public static void main(String[] args) {
        ConcurrentMap<Integer,Integer> cm=new ConcurrentHashMap<>();
        Stream.of(1,2,8,2,5,6,5,8,3,8).forEach(v->{
           cm.merge(v,2,Integer::sum);
        });
        System.out.println(cm);
    }
}
