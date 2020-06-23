package com.wizkifftor.net;

import com.wizkifftor.chapter01.ScalaTest01_FirstProgram;

/**
 * @author WizKifftor
 * 从Java程序调用Scala
 */
public class AccessScala {
    public static void main(String[] args) {
        //访问Scala程序
        System.out.println(ScalaTest01_FirstProgram.test());
//        String s1 = new String("abc");
//        String s2 = new String("abc");
//        System.out.println(s1==s2);
//        System.out.println(s1.equals(s2));
    }
}
