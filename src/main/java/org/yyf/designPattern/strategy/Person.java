package org.yyf.designPattern.strategy;

/**
 * Created by tobi on 16-7-28.
 */
public class Person {
    private  Strategy strategy;
    public Person(Strategy strategy) {
        this.strategy = strategy;
    }

    public Person() {
    }

    public Person setStrategy(Strategy strategy) {
        this.strategy = strategy;
        return this;
    }

    public void eat(){
        this.strategy.eat();
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.setStrategy(Strategy.INDIAN);
        person.eat();
        person.setStrategy(Strategy.CHINESE);
        person.eat();

    }
}
