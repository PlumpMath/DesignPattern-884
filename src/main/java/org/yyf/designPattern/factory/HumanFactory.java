package org.yyf.designPattern.factory;

import java.util.Objects;

/**
 * Created by tobi on 16-9-5.
 */
public class HumanFactory extends AbstractHumanFactory {
    @Override
    public <T extends Human> T createHuman(Class<T> tClass) {
        Objects.requireNonNull(tClass);
        try {
            T result = (T) Class.forName(tClass.getName()).newInstance();
            return result;
        } catch (InstantiationException | ClassNotFoundException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
