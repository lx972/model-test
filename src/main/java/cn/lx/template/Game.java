package cn.lx.template;

/**
 * cn.lx.template
 *
 * @Author Administrator
 * @date 15:27
 */
public abstract class Game {

    //初始化
    abstract void initialze();
    //开始游戏
    abstract void startPlay();
    //结束游戏
    abstract void endPlay();

    /**
     * 具体业务逻辑由子类实现
     * 这里只是定义了方法的执行方式
     */
    public void play(){
        initialze();
        startPlay();
        endPlay();
    }
}
