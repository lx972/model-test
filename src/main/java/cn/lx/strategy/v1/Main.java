package cn.lx.strategy.v1;

/**
 * cn.lx.strategy
 *
 * @Author Administrator
 * @date 17:33
 */
public class Main {
    /*public static void main(String[] args) {
        UserService1 userService1 = new UserService1();
        userService1.login();
        userService1.authentizate();

        //查看内存中缓存信息
        System.out.println(userService1.cache);
    }*/


    public static void main(String[] args) {
        UserService2 userService2 = new UserService2();
        //切换只需要修改这一处代码
        userService2.setCacheDao(new RedisDao());
        userService2.login();
        userService2.authentizate();

        //查看内存中缓存信息

    }
}
