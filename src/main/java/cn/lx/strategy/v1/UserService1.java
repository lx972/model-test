package cn.lx.strategy.v1;

import java.util.HashMap;
import java.util.Map;

/**
 * cn.lx.strategy
 *
 * @Author Administrator
 * @date 17:05
 */
public class UserService1 {

    //内存
    Map<String, Object> cache = new HashMap<String, Object>();


    /**
     * 登录
     */
    public void login() {
        User user = new User();
        user.setAge(13);
        user.setName("test");
        //登录成功了，要将用户信息保存到缓存中
        cache.put(user.getName(), user);
    }

    /**
     * 授权
     * 保存权限信息
     */
    public void authentizate() {

        //授权成功，要将用户权限信息保存到缓存中
        cache.put("test-perm", "admin");
    }
}
