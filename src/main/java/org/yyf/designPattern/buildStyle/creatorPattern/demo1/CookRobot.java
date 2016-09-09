package org.yyf.designPattern.buildStyle.creatorPattern.demo1;

/**
 * Created by tobi on 16-9-7.
 */
public abstract class CookRobot {
    public abstract void sayHello();
    public abstract void playMusic();
    public  void cookie(){
        System.out.println("机器人开始做饭咯～");
    }
    public  void anySuggestion(){
        System.out.println("请问这顿吃得好么?");
    }
    public abstract void wash();
    public abstract void shutdown();

    public void start(){
        sayHello();
        playMusic();
        cookie();
        anySuggestion();
        wash();
        shutdown();
    }
}
