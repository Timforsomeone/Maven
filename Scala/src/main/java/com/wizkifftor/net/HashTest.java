package com.wizkifftor.net;

import java.util.HashMap;
import java.util.Map;

/**
 * @author WizKifftor
 * @Description
 * @E-mail 2319336707@qq.com
 * @Data 2020/5/26 10:47
 */
public class HashTest {
    public static void main(String[] args) {
        Map<User1, User1> map = new HashMap<>();
        for (int i=0;i<40;i++){
            map.put(new User1(),new User1());
        }
    }
}
