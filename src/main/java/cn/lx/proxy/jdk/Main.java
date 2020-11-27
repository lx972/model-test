package cn.lx.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Map;


/**
 * cn.lx.proxy.jdk
 *
 * @Author Administrator
 * @date 15:46
 */
public class Main {
    public static void main(String[] args) {
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true"); //设置系统属性

        final User user = new User();
        //这个方法返回代理类对象
        Subject subject = (Subject) Proxy.newProxyInstance(
                //使用被代理类的类加载器
                User.class.getClassLoader(),
                //共同接口
                new Class[]{Subject.class},
                //与代理类关联的调用逻辑
                new InvocationHandler() {
                    /**
                     * 这个方法处理代理类的业务逻辑
                     * 此处就是什么时候打印日志
                     *
                     * @param proxy  代理类对象
                     * @param method 被代理的方法的对象
                     * @param args   被代理的方法的参数
                     * @return 返回被代理类方法的执行结果
                     */
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        //实现业务逻辑，比如日志
                        System.out.println("日志打印");
                        //执行被代理类的被代理方法
                        return method.invoke(user, args);
                    }
                });

        subject.sell();


        Map<String,String> env = System.getenv();

        for (Map.Entry<String, String> entry : env.entrySet()) {

            System.out.println(entry.getKey()+":"+entry.getValue());
        }
    }
}
