package org.yyf.designPattern.singleton;

import java.util.concurrent.TimeUnit;

/**
 * Created by tobi on 16-7-25.
 */
public class LazySingleton {
    private LazySingleton(){
        System.out.println("singleton　init");
    }
    private static class SingletonHolder{
        private static final LazySingleton singleton = new LazySingleton();
    }
    public static LazySingleton getInstance(){
        return SingletonHolder.singleton;
    }

    public static void main(String[] args) throws InterruptedException {
        TimeUnit.SECONDS.sleep(2);
        System.out.println("before getSinleton method!");
        LazySingleton instance = LazySingleton.getInstance();
    }
}
