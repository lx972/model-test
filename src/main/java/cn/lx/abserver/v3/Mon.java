package cn.lx.abserver.v3;

/**
 * cn.lx.abserver.v1
 *
 * @Author Administrator
 * @date 16:48
 */
public class Mon implements Observer {
    public void wakeup(WakeupEvent event) {
        System.out.println("mama起来喂奶");
    }
}
