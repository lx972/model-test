package cn.lx.factory.v4;

/**
 * cn.lx.factory.v4
 *
 * @Author Administrator
 * @date 17:34
 */
public class BSuitFactory implements AbstractFactory {

    public KeyBoard createKeyBoard() {
        return new AKeyBoard();
    }

    public Mouse createMouse() {
        return new BMouse();
    }
}
