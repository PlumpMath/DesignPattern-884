package org.yyf.designPattern.templateMethod;

/**
 * Created by tobi on 16-9-5.
 */
public class ClientMain {
    public static void main(String[] args) {
        AbstractModel model = new ConcreteModelA();
        model.run();
    }
}
