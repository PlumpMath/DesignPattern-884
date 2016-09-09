package org.yyf.designPattern.buildStyle.factory.factoryMethod;

/**
 * Created by tobi on 16-9-5.
 */
public class YellowHuman implements Human{
    @Override
    public void getColor() {
        System.out.println("color is yellow");
    }

    @Override
    public void talk() {
        System.out.println("mostly talk in chinese");
    }
}
