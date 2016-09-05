package org.yyf.designPattern.factory;

/**
 * Created by tobi on 16-9-5.
 */
public class MainClient {
    public static void main(String[] args) {
        HumanFactory humanFactory = new HumanFactory();
        WhiteHuman whiteHuman = humanFactory.createHuman(WhiteHuman.class);
        whiteHuman.getColor();
        whiteHuman.talk();

        YellowHuman yellowHuman = humanFactory.createHuman(YellowHuman.class);
        yellowHuman.getColor();
        yellowHuman.talk();

        BlackHuman blackHuman = humanFactory.createHuman(BlackHuman.class);
        blackHuman.getColor();
        blackHuman.talk();
    }
}
