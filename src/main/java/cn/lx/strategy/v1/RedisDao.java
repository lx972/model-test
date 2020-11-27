package cn.lx.strategy.v1;

/**
 * cn.lx.strategy
 *
 * @Author Administrator
 * @date 17:04
 */
public class RedisDao implements CacheDao {
    public void add(String key, Object value) {

    }

    public void delete(String key) {

    }

    public Object get(String key) {
        return null;
    }


    /*private RedisTemplate<String,Object> redisTemplate;

    public void add(String key, Object value) {
        redisTemplate.opsForValue().set(key, value);

    }

    public void delete(String key) {
        redisTemplate.delete(key);
    }

    public Object get(String key) {
        return redisTemplate.opsForValue().get(key);
    }*/
}
