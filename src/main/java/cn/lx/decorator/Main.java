package cn.lx.decorator;

/**
 * cn.lx.decorator
 *
 * @Author Administrator
 * @date 11:40
 */
public class Main {
    public static void main(String[] args) {
        //被装饰类对象
        User user = new User();
        //装饰器
        Decorator decorator = new PublishDecorator();
        //被装饰类对象设置到装饰器中
        decorator.setPurchasing(user);
        //装饰成功
        decorator.purchase();
    }
}
