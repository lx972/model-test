package cn.lx.factory.v2;

import cn.lx.factory.v1.AMouse;
import cn.lx.factory.v1.BMouse;
import cn.lx.factory.v1.Mouse;

/**
 * cn.lx.factory.v1
 *
 * @Author Administrator
 * @date 16:07
 */
public class StaticFactory {

    public static Mouse getMouse(String type){
        if ("A".equalsIgnoreCase(type)){
            return new AMouse();
        }else if ("B".equalsIgnoreCase(type)){
            return new BMouse();
        }
        return null;
    }
}

