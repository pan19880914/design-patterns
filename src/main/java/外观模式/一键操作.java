package 外观模式;

/**
 * <p>
 * 一键操作
 * </p>
 *
 * @author Administrator
 * @version 1.0
 * @since 2019-04-04 16:20
 **/
public class 一键操作 {

    private 头盔 头盔;
    private 武器 武器;
    private 衣服 衣服;
    private 裤子 裤子;
    private 鞋子 鞋子;

    public 一键操作() {
        this.头盔 = new 头盔();
        this.武器 = new 武器();
        this.衣服 = new 衣服();
        this.裤子 = new 裤子();
        this.鞋子 = new 鞋子();
    }

    public void 穿戴装备(){
        头盔.on();
        武器.on();
        衣服.on();
        裤子.on();
        鞋子.on();
    }

    public void 脱下装备(){
        头盔.off();
        武器.off();
        衣服.off();
        裤子.off();
        鞋子.off();
    }

}
