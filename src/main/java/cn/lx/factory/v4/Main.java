package cn.lx.factory.v4;

/**
 * cn.lx.factory.v4
 *
 * @Author Administrator
 * @date 17:47
 */
public class Main {
    public static void main(String[] args) {

        AMouse aMouse = new AMouse();
        aMouse.type();
        AKeyBoard aKeyBoard = new AKeyBoard();
        aKeyBoard.type();


        ASuitFactory aSuitFactory = new ASuitFactory();
        Mouse mouse=aSuitFactory.createMouse();
        KeyBoard keyBoard=aSuitFactory.createKeyBoard();
        mouse.type();
        keyBoard.type();
    }
}
