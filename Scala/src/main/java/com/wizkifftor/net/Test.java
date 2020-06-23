package com.wizkifftor.net;


import java.util.HashMap;

/**
 * @author WizKifftor
 * @Description
 * @E-mail 2319336707@qq.com
 * @Data 2020/5/26 9:23
 */
public class Test {
    public static void main(String[] args) {
//        String kl = new String();
//        System.out.println(test(kl));
//        System.out.println(toI(10));
        System.out.println(toK(88));
    }

    public static boolean test(String str) {
        return str != null && !str.trim().equals("");
    }

    public static double toI(double flag) {
        if (flag <= 1) {
            return 1;
        } else
            return flag * toI(--flag);
    }

    public static int toK(int dou) {
        if (dou % 2 != 0)
            return dou << 1;
        else
            return dou >> 1;
    }
}
