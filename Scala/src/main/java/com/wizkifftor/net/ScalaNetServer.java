package com.wizkifftor.net;


import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author WizKifftor
 * @Description
 * @E-mail 2319336707@qq.com
 * @Data 2020/5/19 8:58
 */
public class ScalaNetServer {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(9999);
        Socket client = server.accept();
        int data = client.getInputStream().read();
        System.out.println("Server receive data: " + data);
    }

}
