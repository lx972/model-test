package cn.lx.strategy.v1;

/**
 * cn.lx.strategy
 * 僵尸
 * @Author Administrator
 * @date 17:05
 */
public class UserService2 {

    public CacheDao getCacheDao() {
        return cacheDao;
    }

    public void setCacheDao(CacheDao cacheDao) {
        this.cacheDao = cacheDao;
    }

    /**
     * 我们需要用哪种缓存策略，我们就传入对应策略的对象
     *
     */
    private CacheDao cacheDao;


    /**
     * 登录
     */
    public void login() {
        User user = new User();
        user.setAge(13);
        user.setName("test");
        //登录成功了，要将用户信息保存到缓存中
        cacheDao.add(user.getName(), user);
    }

    /**
     * 授权
     * 保存权限信息
     */
    public void authentizate() {

        //授权成功，要将用户权限信息保存到缓存中
        cacheDao.add("test-perm", "admin");
    }
}
