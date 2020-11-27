package cn.lx.singleton.v5;

/**
 * cn.lx.singleton.v4
 *
 * @Author Administrator
 * @date 16:25
 */
public enum SingletonTest {
    instance;

    /**
     * 在枚举中写正常的业务方法
     */
    public void m(){
        //该类正常的业务逻辑
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(new Runnable() {
                public void run() {
                    SingletonTest instance = SingletonTest.instance;
                    System.out.println(instance.hashCode());
                }
            }).start();
        }
    }
}
