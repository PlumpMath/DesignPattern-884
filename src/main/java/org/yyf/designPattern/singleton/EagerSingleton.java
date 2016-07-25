package org.yyf.designPattern.singleton;

import java.util.concurrent.TimeUnit;

/**
 * Created by tobi on 16-7-25.
 */
public class EagerSingleton {
    private EagerSingleton() {
        System.out.println("init!");
    }

    private static final EagerSingleton singleton = new EagerSingleton();

    public static EagerSingleton getSingleton() {
        return singleton;
    }

    public static void main(String[] args) throws InterruptedException {
        TimeUnit.SECONDS.sleep(2);
        System.out.println("before getSinleton method!");
        EagerSingleton singleton = EagerSingleton.getSingleton();
        EagerSingleton singleton1 = EagerSingleton.getSingleton();
        System.out.println(singleton==singleton1);
    }
}
