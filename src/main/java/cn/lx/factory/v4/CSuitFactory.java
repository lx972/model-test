package cn.lx.factory.v4;

/**
 * cn.lx.factory.v4
 *
 * @Author Administrator
 * @date 17:34
 */
public class CSuitFactory implements AbstractFactory {

    public KeyBoard createKeyBoard() {
        return new BKeyBoard();
    }

    public Mouse createMouse() {
        return new AMouse();
    }
}
