package org.yyf.designPattern.buildStyle.singleton;

import java.util.concurrent.TimeUnit;

/**
 * Created by tobi on 16-7-25.
 */
public enum EnumSingleton {
    singleton;

    EnumSingleton() {
        System.out.println("init!");
    }

    public void doSomething() {
        System.out.println("i do sth");

    }

    public static void main(String[] args) throws InterruptedException {
        TimeUnit.SECONDS.sleep(2);
        System.out.println("sleep finished");
        EnumSingleton.singleton.doSomething();
    }
}
