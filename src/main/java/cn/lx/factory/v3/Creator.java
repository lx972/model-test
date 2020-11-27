package cn.lx.factory.v3;

/**
 * cn.lx.factory.v3
 * 准备一个地方，用来生产鼠标，但是现在还没有生产的设备
 * 等到用户决定要那种鼠标，再购买对应的设备
 *
 * @Author Administrator
 * @date 16:56
 */
public interface Creator {

    Mouse factoryMethod();
}
