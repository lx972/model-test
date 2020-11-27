package cn.lx.singleton.v1;

/**
 * cn.lx.singleton.v1
 * <p>
 * 饿汉模式
 *
 * @Author Administrator
 * @date 15:24
 */
public class SingletonTest {

    private final static SingletonTest instance = new SingletonTest();

    /**
     * 将构造方法改为私有的，就无法new了
     */
    private SingletonTest() {
    }

    public static SingletonTest getInstance() {
        return instance;
    }

    /**
     * 模拟并发情况，100个线程同时获取实例
     *
     * @param args
     */
    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            new Thread(new Runnable() {
                public void run() {
                    SingletonTest instance = SingletonTest.getInstance();
                    System.out.println(instance.hashCode());
                }
            }).start();
        }
    }
}
