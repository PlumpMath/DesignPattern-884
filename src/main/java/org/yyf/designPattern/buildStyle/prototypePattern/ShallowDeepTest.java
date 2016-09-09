package org.yyf.designPattern.buildStyle.prototypePattern;

import com.google.common.collect.Lists;

import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by tobi on 16-9-8.
 */
public class ShallowDeepTest {
    public static void main(String[] args) {
        Robot robot = new Robot();
        robot.setName("雷姆1号");
        robot.setBirthDay(new Date());
        robot.setId(1L);
        robot.setQualified(true);
        List<String> weaponList = Lists.newArrayList("流星锤", "嘴炮");
        robot.setWeaponList(weaponList);
        System.out.println(robot);

        try {
          Robot robotClone=  (Robot)robot.clone();
            System.out.println(robotClone);
            robotClone.setId(2L);
            robotClone.setName("雷姆Clone");
            TimeUnit.SECONDS.sleep(1);
            robotClone.setBirthDay(new Date());
            robotClone.setQualified(false);
            weaponList.remove(1);//雷姆不用嘴炮，嘿嘿
            System.out.println("after changed");
            System.out.println(robot);
            System.out.println(robotClone);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
