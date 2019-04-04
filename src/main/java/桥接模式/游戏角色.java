package 桥接模式;

/**
 * <p>
 * 游戏角色
 * </p>
 *
 * @author Administrator
 * @version 1.0
 * @since 2019-04-04 16:51
 **/
abstract class 游戏角色 {
    游戏角色性别 游戏角色性别;
    public 游戏角色(游戏角色性别 游戏角色性别) {
        this.游戏角色性别 = 游戏角色性别;
    }
    public abstract void 创建角色();
}
