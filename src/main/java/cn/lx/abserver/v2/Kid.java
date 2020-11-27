package cn.lx.abserver.v2;

import java.util.ArrayList;
import java.util.List;

/**
 * cn.lx.abserver.v1
 *
 * @Author Administrator
 * @date 16:47
 */
public class Kid {

    List<Observer> observers = new ArrayList<Observer>();

    private boolean cry = false;

    public void cry() {
        cry = true;
        System.out.println("哭哭哭");
        //通知所有的观察者
        for (Observer observer : observers) {
            observer.wakeup();
        }

    }
}
