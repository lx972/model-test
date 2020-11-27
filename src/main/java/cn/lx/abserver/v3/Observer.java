package cn.lx.abserver.v3;

/**
 * cn.lx.abserver.v1
 *
 * @Author Administrator
 * @date 16:50
 */
public interface Observer {

    /**
     * 小孩醒了，通知观察者
     */
    void wakeup(WakeupEvent event);
}
