package com.wizkifftor.net;

import java.io.Serializable;

/**
 * @author WizKifftor
 * @Description
 * @E-mail 2319336707@qq.com
 * @Data 2020/5/22 16:25
 */
public class User implements Serializable {
    private int age;
    private String name;
    private String gender;



    public User() {    }

    public User(int age, String name, String gender) {
        this.age = age;
        this.name = name;
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return  "\n name :" + name  + "\n age :" + age +"\n gender :" + gender ;
    }
}
