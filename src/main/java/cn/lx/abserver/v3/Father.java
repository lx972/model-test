package cn.lx.abserver.v3;

/**
 * cn.lx.abserver.v1
 *
 * @Author Administrator
 * @date 16:49
 */
public class Father implements Observer {
    public void wakeup(WakeupEvent event) {

        System.out.println("baba起来抱着");
    }
}
