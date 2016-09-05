package org.yyf.designPattern.templateMethod;

/**
 * Created by tobi on 16-9-5.
 */
public class ConcreteModelA extends AbstractModel{
    @Override
    protected void method1() {
        System.out.println("在ConcreteModelA中执行method1，逻辑balabala");
    }

    @Override
    protected void method3() {
        System.out.println("在ConcreteModelA中执行method3，逻辑balabala");
    }

    @Override
    protected boolean canExecute() {
        return true;
    }
}
