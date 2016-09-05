package org.yyf.designPattern.creatorPattern;

/**
 * Created by tobi on 16-9-5.
 */
public class UserBean {
    private String id;
    private String name;
    private String sex;
    private int age;
    private String department;

    public static class Builder {
        /*
         * 只能指定一次。
         */
        private final String id;
        private final String department;

        private String name = "";
        private String sex = "男";
        private int age = 20;

        /*
         * 非空属性，必须在构造器中指定。
         */
        public Builder(String id, String department) {
            this.id = id;
            this.department = department;
        }

        /*
         * name,sex,age可选择属性，提供特殊的setter方法。
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder sex(String sex) {
            this.sex = sex;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        /*
         * Student对象创建器，想得到一个Student对象必须使用build 方法，
         * 在方法中增加对Builder参数的验证，并以异常的形式告诉给开发人员。
         */
        public UserBean build() {
            /* 检查Builder对象中的数据是否合法。
             * 针对这个例子，就是检查主键冲突，外键制约等
             * 如果不满足我们可以抛出一个IllegalArgumentException
             */
            return new UserBean(this);

        }

    }

    public UserBean(UserBean.Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.sex = builder.sex;
        this.age = builder.age;
        this.department = builder.department;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    public String getDepartment() {
        return department;
    }

    public static void main(String[] args) {
        UserBean.Builder builder = new UserBean.Builder("03041013", "计算机");
        builder.name("李华");
        UserBean userBean = builder.build();
    }
}
