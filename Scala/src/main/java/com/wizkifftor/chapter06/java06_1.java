package com.wizkifftor.chapter06;

/**
 * @author WizKifftor
 * @Description
 * @E-mail 2319336707@qq.com
 * @Data 2020/6/8 8:53
 */
public class java06_1 {
    public static void main(String[] args) throws Exception {
        Thread t1 = new Thread(
                new Runnable() {
                    @Override
                    public void run() {
                        System.out.println("Thread01 start");
                    }
                }
        );
        Thread t2 = new Thread(
                new Runnable() {
                    @Override
                    public void run() {
                        System.out.println("Thread2 start");
                    }
                });

        t1.start();
        t2.start();

        //核心区别：在字体上
        //静态方法在IDEA中默认是斜体的
        //TODO 静态方法和类型相关，与对象无关
        //sleep方法t1无关，就不可能让t1休眠，让当前正在执行的线程（main）休眠
        //sleep无法释放对象锁
        t1.sleep(10000);//public static native void sleep
        //成员方法在IDEA中默认非斜体的
        //TODO 成员方法与对象相关
        //wait方法和t2相关，可以让t2等待
        //wait可以释放对象锁
        t2.wait();//public final void wait()
    }
}
