package cn.lx.adaptor.v1;

import cn.lx.adaptor.v1.Input5v;

/**
 * cn.lx.adaptor
 * 手机充电5v
 * @Author Administrator
 * @date 12:07
 */
public class Voltage5v implements Input5v {
    public int input5v() {
        System.out.println("5v");
        return 5;
    }
}
