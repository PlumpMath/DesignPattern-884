package org.yyf.designPattern.adatper;

/**
 * Created by tobi on 16-7-29.
 */
public class Client {
    public static void main(String[] args) {
        LocalService localService = new LocalServiceAdapterForRemote();
        User userInfo = localService.getUserInfo();
        System.out.println(userInfo);
    }
}
