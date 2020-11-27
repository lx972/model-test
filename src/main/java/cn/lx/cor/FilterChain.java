package cn.lx.cor;

import java.util.ArrayList;
import java.util.List;

/**
 * cn.lx.cor.v1
 *
 * @Author Administrator
 * @date 11:14
 */
public class FilterChain {
    //需要通过的过滤器
    List<Filter> filters=new ArrayList<Filter>();

    //当前执行到第几个过滤器
    private int index=0;

    public FilterChain() {
    }

    public FilterChain addFilter(Filter filter){
        filters.add(filter);
        return this;
    }
    void doFilter(Request request, Response response){
        if ((index!=filters.size()-1)&&filters.size()!=0){
            //不是最后一个过滤器
            Filter filter = filters.get(index);
            index++;
            filter.doFilter(request,response,this);
        }else{
            //所有过滤器执行完了之后，开始执行自己的业务逻辑，然后再沿原路返回

        }
    }
}
