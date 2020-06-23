package com.wizkifftor.net;

import org.junit.Test;

import java.net.Socket;

/**
 * @author WizKifftor
 * @Description
 * @E-mail 2319336707@qq.com
 * @Data 2020/5/19 9:02
 */
public class ScalaNetClient {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("localhost",9999);
        int data = 50;
        socket.getOutputStream().write(data);
        System.out.println("Client send data: "+data);
        socket.close();


    }
//    @Test
//    public void stringToOthers(){
//        String string = "12";
//        int i = Integer.parseInt(string);
//        System.out.println(i);
//
//        string ="125.23545333";
//        float v = Float.parseFloat(string.substring(0,8));
//        System.out.println(v);
//
//        double parseDouble = Double.parseDouble(string.substring(0,5));
//        System.out.println(parseDouble);
//
//    }
//
//    @Test
//    public void othersToString(){
//        Integer integer = 1000;
//        Float fl = 12545.3f;
//        String string = integer.toString();
//        System.out.println(string);
//
//        String string1 = fl.toString();
//        System.out.println(string1);
//
//    }


}
