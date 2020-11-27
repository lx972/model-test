package cn.lx.decorator;

/**
 * cn.lx.decorator
 * 正版
 * @Author Administrator
 * @date 11:22
 */
public class GenuineDecorator extends Decorator{

    @Override
    public void purchase() {
        //验证是否正版
        System.out.println("是正版");

        getPurchasing().purchase();
    }
}
