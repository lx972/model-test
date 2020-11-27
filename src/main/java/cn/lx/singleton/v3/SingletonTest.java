package cn.lx.singleton.v3;

/**
 * cn.lx.singleton.v3
 *
 * @Author Administrator
 * @date 15:35
 */
public class SingletonTest {

    private static SingletonTest instance;

    /**
     * 将构造方法改为私有的，就无法new了
     */
    private SingletonTest() {
    }

    public static SingletonTest getInstance() {
        //双重判断，主要是为了解决第一次获取实例时的并发访问
        //以后获取实例的时候，不会运行加锁的代码，就不会影响效率了
        if (instance == null) {
            synchronized (SingletonTest.class) {
                if (instance == null) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    instance = new SingletonTest();
                }
            }

        }
        return instance;
    }

    /**
     * 模拟并发情况，100个线程同时获取实例
     *
     * @param args
     * @throws InterruptedException
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
