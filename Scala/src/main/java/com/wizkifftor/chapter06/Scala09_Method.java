package com.wizkifftor.chapter06;

/**
 * @author WizKifftor
 * @Description
 * @E-mail 2319336707@qq.com
 * @Data 2020/6/16 10:45
 */
public class Scala09_Method  {

    public static void main(String[] args) throws Exception{
       Person man = new Man();
        Person person = new Person();
        person.clone();
        man.sum();
    }
}
class Person{

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public void sum(){
        System.out.println("Person sum()");
    }
}

class Man extends Person{
    @Override
    public void sum() {
        System.out.println("Man sum()");
    }
}