package cn.lx.proxy.cglib;

import net.sf.cglib.core.DebuggingClassWriter;
import net.sf.cglib.proxy.*;

import java.lang.reflect.Method;


/**
 * cn.lx.proxy.cglib
 *
 * @Author Administrator
 * @date 16:07
 */
public class Main {
    public static void main(String[] args) {

        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "C:\\class");

        //被代理类对象
        final User user = new User();

        //增强器
        Enhancer e = new Enhancer();
        //设置被代理类的父类
        e.setSuperclass(User.class);

        //设置回调
        e.setCallback(new MethodInterceptor() {
            /**
             * All generated proxied methods call this method instead of the original method.
             * The original method may either be invoked by normal reflection using the Method object,
             * or by using the MethodProxy (faster).
             *
             * @param obj    "this", the enhanced object
             * @param method intercepted Method
             * @param args   argument array; primitive types are wrapped
             * @param proxy  used to invoke super (non-intercepted method); may be called
             *               as many times as needed
             * @return any value compatible with the signature of the proxied method. Method returning void will ignore this value.
             * @throws Throwable any exception may be thrown; if so, super method will not be invoked
             * @see MethodProxy
             */
            public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
                System.out.println("代理前");
                //执行被代理类的被代理方法
                Object invoke = method.invoke(user, args);
                System.out.println("代理后");
                return invoke;
            }
        });
        //创建代理类
        User proxy = (User) e.create();
        proxy.sell();
    }
}
