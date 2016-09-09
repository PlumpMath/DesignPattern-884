package org.yyf.designPattern.buildStyle.prototypePattern;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by tobi on 16-9-8.
 */

public class RobotForDeepClone implements Cloneable {
    private Long id;
    private String name;
    private Date birthDay;
    private Boolean qualified;
    private ArrayList<String> weaponList;

    public ArrayList<String> getWeaponList() {
        return weaponList;
    }

    public RobotForDeepClone setWeaponList(ArrayList<String> weaponList) {
        this.weaponList = weaponList;
        return this;
    }

    public RobotForDeepClone() {
        System.out.println("i am in constructor");
    }

    public Long getId() {
        return id;
    }

    public RobotForDeepClone setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public RobotForDeepClone setName(String name) {
        this.name = name;
        return this;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public RobotForDeepClone setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
        return this;
    }

    public Boolean getQualified() {
        return qualified;
    }

    public RobotForDeepClone setQualified(Boolean qualified) {
        this.qualified = qualified;
        return this;
    }

    @Override
    public RobotForDeepClone clone()   {
        try {
            RobotForDeepClone   clonedRobot = (RobotForDeepClone) super.clone();
            clonedRobot.weaponList= (ArrayList<String>) this.weaponList.clone();
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);//只要当前对象实现了Cloneable接口,就不会抛出此异常。
        }
    }

    @Override
    public String toString() {
        return "Robot{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthDay=" + birthDay +
                ", qualified=" + qualified +
                ", weaponList=" + weaponList +
                '}';
    }
}
