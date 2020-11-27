package cn.lx.abserver.v3;

/**
 * cn.lx.abserver.v1
 *
 * @Author Administrator
 * @date 16:49
 */
public class Main {
    public static void main(String[] args) {
        Kid kid = new Kid();
        //给小孩设置观察者
        kid.observers.add(new Father());
        kid.observers.add(new Mon());

        //小孩开始哭了，自动通知爸爸妈妈
        kid.cry();
    }
}
