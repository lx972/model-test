package cn.lx.decorator;

/**
 * cn.lx.decorator
 * 抽象装饰类
 *
 * @Author Administrator
 * @date 11:30
 */
public abstract class Decorator implements Purchasing {

    /**
     * 可以是被装饰类，也可以是装饰类
     */
    private Purchasing purchasing;

    /**
     * 抽象的买书方法
     */
    public abstract void purchase();

    public Purchasing getPurchasing() {
        return purchasing;
    }

    public void setPurchasing(Purchasing purchasing) {
        this.purchasing = purchasing;
    }

}
