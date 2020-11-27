package cn.lx.factory.v3;

/**
 * cn.lx.factory.v3
 *
 * @Author Administrator
 * @date 16:58
 */
public class BMouseCreator implements Creator {

    public Mouse factoryMethod() {
        return new BMouse();
    }
}
