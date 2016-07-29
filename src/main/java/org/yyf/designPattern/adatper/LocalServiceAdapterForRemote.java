package org.yyf.designPattern.adatper;

import java.util.Map;

/**
 * Created by tobi on 16-7-29.
 */
public class LocalServiceAdapterForRemote implements LocalService  {
    private RemoteService remoteService=new RemoteService();//可以通过依赖或者继承来实现适配
    @Override
    public User getUserInfo() {
        Map userInfo = remoteService.getUserInfo();
        User newUser = new User().setId((Long) userInfo.get("id"));
        return newUser;
    }
}
