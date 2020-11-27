package cn.lx.cor;

/**
 * cn.lx.cor.v1
 *
 * @Author Administrator
 * @date 11:13
 */
public interface Filter {
    /**
     * 模拟过滤器
     * @param request
     * @param response
     * @param filterChain
     */
    void doFilter(Request request,Response response,FilterChain filterChain);
}
