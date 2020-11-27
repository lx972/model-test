package cn.lx.decorator;

/**
 * cn.lx.decorator
 *
 * @Author Administrator
 * @date 11:21
 */
public class User implements Purchasing {

    public void purchase() {
        System.out.println("购买一本书");
    }
}
