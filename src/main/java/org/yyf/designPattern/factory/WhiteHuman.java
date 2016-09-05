package org.yyf.designPattern.factory;

/**
 * Created by tobi on 16-9-5.
 */
public class WhiteHuman implements Human{
    @Override
    public void getColor() {
        System.out.println("color is white");
    }

    @Override
    public void talk() {
        System.out.println("mostly talk in english!");
    }
}
