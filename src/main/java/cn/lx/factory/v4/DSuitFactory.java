package cn.lx.factory.v4;

/**
 * cn.lx.factory.v4
 *
 * @Author Administrator
 * @date 17:34
 */
public class DSuitFactory implements AbstractFactory {

    public KeyBoard createKeyBoard() {
        return new BKeyBoard();
    }

    public Mouse createMouse() {
        return new BMouse();
    }
}
