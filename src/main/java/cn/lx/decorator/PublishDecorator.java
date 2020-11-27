package cn.lx.decorator;

/**
 * cn.lx.decorator
 * 出版社
 * @Author Administrator
 * @date 11:22
 */
public class PublishDecorator extends Decorator{


    @Override
    public void purchase() {

        //验证是否是某个出版社
        System.out.println("是人社");

        getPurchasing().purchase();
    }
}
