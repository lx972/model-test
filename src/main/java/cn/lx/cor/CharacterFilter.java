package cn.lx.cor;

/**
 * cn.lx.cor.v1
 *
 * @Author Administrator
 * @date 11:31
 */
public class CharacterFilter implements Filter {
    public void doFilter(Request request, Response response, FilterChain filterChain) {
        //对request做一系列处理

        //放行
        filterChain.doFilter(request,response);

        //对response做一系列处理


    }
}
