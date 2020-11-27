package cn.lx.abserver.v1;

/**
 * cn.lx.abserver.v1
 *
 * @Author Administrator
 * @date 16:49
 */
public class Main {
    public static void main(String[] args) {
        final Kid kid = new Kid();
        Father father = new Father();
        Mon mon = new Mon();

        //10秒后孩子开始哭
        new Thread(new Runnable() {
            public void run() {
                try {
                    Thread.sleep(10000);
                    //小孩开始哭了，自动通知爸爸妈妈
                    kid.cry();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }).start();


        //主线程一直循环，监视孩子是否哭泣
        while (true){
            System.out.println("盯着孩子");
           if (kid.isCry()){
               father.action();
               mon.action();
               break;
           }
       }
    }
}
