package 桥接模式;

/**
 * <p>
 * 玩家
 * </p>
 *  桥接器模式：桥接模式是将抽象部分与它的实现部分分离，使它们都可以独立地变化。
 * @author Administrator
 * @version 1.0
 * @since 2019-04-04 17:08
 **/
public class 玩家 {
    public static void main(String[] args) {
        游戏角色 游戏角色 = new 战士(new 游戏角色男());
        游戏角色.创建角色();
    }
}
