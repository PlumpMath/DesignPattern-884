package org.yyf.designPattern.behaviorStyle.strategy;

/**
 * Created by tobi on 16-7-28.
 */
public enum  Strategy {
    USAEater {
        @Override
        public void eat() {
            System.out.println("美国人用手,用刀叉吃饭");
        }
    },
    INDIAN {
        @Override
        public void eat() {
            System.out.println("印度人用手吃饭");
        }
    },
    CHINESE {
        @Override
        public void eat() {
            System.out.println("中国人用手");
        }
    };


    public abstract void eat();
}
