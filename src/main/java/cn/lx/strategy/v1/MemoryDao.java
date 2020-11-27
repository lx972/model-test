package cn.lx.strategy.v1;

import java.util.HashMap;
import java.util.Map;

/**
 * cn.lx.strategy
 *
 * @Author Administrator
 * @date 17:00
 */
public class MemoryDao implements CacheDao {

    //内存
    Map<String, Object> cache = new HashMap<String, Object>();

    public void add(String key, Object value) {
        cache.put(key, value);
    }

    public void delete(String key) {
        cache.remove(key);
    }

    public Object get(String key) {
        return cache.get(key);
    }
}
