package cn.lx.factory.v4;

/**
 * cn.lx.factory.v4
 * 套装,一个生产套装的地方
 * @Author Administrator
 * @date 17:21
 */
public interface AbstractFactory {

    //生产键盘
   KeyBoard createKeyBoard();

    //生产鼠标
   Mouse createMouse();

}
