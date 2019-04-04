package 外观模式;

/**
 * <p>
 * 玩家
 * </p>
 *
 * 外观模式：要求一个子系统的外部与其内部的通信必须通过一个统一的对象进行。门面模式提供一个高层次的接口，使得子系统更易于使用。
 *
 * @author Administrator
 * @version 1.0
 * @since 2019-04-04 16:27
 **/
public class 玩家 {
    public static void main(String[] args) {
        一键操作 一键操作 = new 一键操作();
        一键操作.穿戴装备();
        一键操作.脱下装备();
    }
}
