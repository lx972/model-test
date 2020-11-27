package cn.lx.strategy.v1;

/**
 * cn.lx.strategy
 *
 * @Author Administrator
 * @date 17:01
 */
public interface CacheDao {

     void add(String key,Object value);
     void delete(String key);
     Object get(String key);

}
