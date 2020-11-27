package cn.lx.singleton.v2;


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

    public static synchronized SingletonTest getInstance() {
        if (instance == null) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            instance = new SingletonTest();
        }
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
