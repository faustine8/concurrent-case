package com.concurrent;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;


public class ServerSocketExample {
    public static void main(String[] args) throws IOException, InterruptedException {
        final int DEFAULT_PORT = 8080;
        ServerSocket serverSocket = null;
        serverSocket = new ServerSocket(DEFAULT_PORT);
        System.out.println("启动服务，监听端口：" + DEFAULT_PORT);
        while (true) {
            Socket socket = serverSocket.accept();
            new Thread(new SocketThread(socket)).start();
        }
    }
}
