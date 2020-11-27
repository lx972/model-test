package cn.lx.factory.v4;

/**
 * cn.lx.factory.v4
 * 上班族套装，这个工厂值生产上班族套装所需的
 * @Author Administrator
 * @date 17:34
 */
public class ASuitFactory implements AbstractFactory {

    public KeyBoard createKeyBoard() {
        return new AKeyBoard();
    }

    public Mouse createMouse() {
        return new AMouse();
    }
}
