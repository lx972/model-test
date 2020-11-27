package cn.lx.singleton.v4;

/**
 * cn.lx.singleton.v3
 *
 * @Author Administrator
 * @date 15:35
 */
public class SingletonTest {

    /**
     * 这种方式是利用了jvm加载类只加载一次来保证线程安全的
     * 而且静态内部类在外部类被加载的时候不会被加载
     */
    private static class SingletonHolder {
        private final static SingletonTest instance = new SingletonTest();
    }

    /**
     * 将构造方法改为私有的，就无法new了
     */
    private SingletonTest() {
    }

    public static SingletonTest getInstance() {
        return SingletonHolder.instance;
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
