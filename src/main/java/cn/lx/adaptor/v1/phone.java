package cn.lx.adaptor.v1;

import cn.lx.adaptor.v1.Input5v;

/**
 * cn.lx.adaptor
 *
 * @Author Administrator
 * @date 11:57
 */
public class phone {

    public void charge(Input5v input5v){
        if (input5v.input5v()==5){
            System.out.println("充电成功");
        }else {
            System.out.println("充电失败");
        }

    }
}
