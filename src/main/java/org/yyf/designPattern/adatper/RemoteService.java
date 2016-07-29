package org.yyf.designPattern.adatper;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by tobi on 16-7-29.
 */
public class RemoteService {
    public Map getUserInfo(){
        System.out.println("调用远程服务，返回Map");
        return new HashMap<>();
    }
}
