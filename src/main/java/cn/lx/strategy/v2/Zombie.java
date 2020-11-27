package cn.lx.strategy.v2;

/**
 * cn.lx.strategy.v2
 * 行动方式
 * 攻击方式
 * @Author Administrator
 * @date 16:32
 */
public abstract class Zombie {

    private Attackable attackable;

    private Moveable moveable;

    abstract public void display();
}
