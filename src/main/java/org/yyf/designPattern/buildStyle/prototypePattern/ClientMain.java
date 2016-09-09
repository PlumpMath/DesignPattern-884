package org.yyf.designPattern.buildStyle.prototypePattern;

import com.google.common.base.Stopwatch;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * Created by tobi on 16-9-8.
 * 感觉原型模式时间上的差距也不是很明显，因为是简单对象？
 */
public class ClientMain {
    public static void main(String[] args) {
        Stopwatch started = Stopwatch.createStarted();
        Integer times = 10*10000*10000;
//        for (int i = 0; i < times; i++) {
//            Robot robot = new Robot();
//            robot.setName("雷姆1号");
//            robot.setBirthDay(new Date());
//            robot.setId(1L);
//            robot.setQualified(true);
//        }
//        started.stop();
//        System.out.println(started.elapsed(TimeUnit.SECONDS));
//        started.start();

        Robot robot = new Robot();
        robot.setName("雷姆1号");
        robot.setBirthDay(new Date());
        robot.setId(1L);
        robot.setQualified(true);
        for (int i = 0; i < times; i++) {
            try {
                robot.clone();
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
        }
        started.stop();
        System.out.println(started.elapsed(TimeUnit.SECONDS));
    }
}
