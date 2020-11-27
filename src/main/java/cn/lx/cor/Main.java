package cn.lx.cor;

/**
 * cn.lx.cor.v1
 *
 * @Author Administrator
 * @date 11:38
 */
public class Main {
    public static void main(String[] args) {

        //模拟controller中的request和response
        Request request = new Request();
        Response response = new Response();

        //创建一个过滤器链，并添加过滤器
        FilterChain filterChain = new FilterChain()
                .addFilter(new StringFilter())
                .addFilter(new CharacterFilter());

        //执行过滤器链
        filterChain.doFilter(request,response);
    }
}
