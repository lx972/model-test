package cn.lx.abserver.v1;

import cn.lx.abserver.v2.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * cn.lx.abserver.v1
 *
 * @Author Administrator
 * @date 16:47
 */
public class Kid {

    private boolean cry = false;

    public boolean isCry() {
        return cry;
    }

    public void setCry(boolean cry) {
        this.cry = cry;
    }

    public void cry() {
        cry = true;
        System.out.println("哭哭哭");
    }
}
