package org.yyf.designPattern.buildStyle.prototypePattern;

import java.util.Date;
import java.util.List;

/**
 * Created by tobi on 16-9-8.
 */

public class Robot implements Cloneable {
    private Long id;
    private String name;
    private Date birthDay;
    private Boolean qualified;
    private List<String> weaponList;

    public List<String> getWeaponList() {
        return weaponList;
    }

    public Robot setWeaponList(List<String> weaponList) {
        this.weaponList = weaponList;
        return this;
    }

    public Robot() {
        System.out.println("i am in constructor");
    }

    public Long getId() {
        return id;
    }

    public Robot setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Robot setName(String name) {
        this.name = name;
        return this;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public Robot setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
        return this;
    }

    public Boolean getQualified() {
        return qualified;
    }

    public Robot setQualified(Boolean qualified) {
        this.qualified = qualified;
        return this;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
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
