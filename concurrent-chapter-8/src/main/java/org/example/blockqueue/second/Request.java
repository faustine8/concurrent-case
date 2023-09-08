package org.example.blockqueue.second;

import lombok.Data;


@Data
public class Request {
    private String name;

    @Override
    public String toString() {
        return "Request{" +
                "name='" + name + '\'' +
                '}';
    }
}
