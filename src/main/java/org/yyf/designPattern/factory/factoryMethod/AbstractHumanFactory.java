package org.yyf.designPattern.factory.factoryMethod;

/**
 * Created by tobi on 16-9-5.
 */
public abstract class AbstractHumanFactory {
    public abstract <T extends Human> T createHuman(Class<T> tClass);
}
