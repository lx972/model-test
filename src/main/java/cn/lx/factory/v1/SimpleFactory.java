package cn.lx.factory.v1;

/**
 * cn.lx.factory.v1
 *
 * @Author Administrator
 * @date 16:07
 */
public class SimpleFactory {

    Mouse getMouse(String type){
        if ("A".equalsIgnoreCase(type)){
            return new AMouse();
        }else if ("B".equalsIgnoreCase(type)){
            return new BMouse();
        }
        return null;
    }
}

