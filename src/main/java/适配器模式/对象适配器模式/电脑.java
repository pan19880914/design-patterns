package 适配器模式.对象适配器模式;

/**
 * <p>
 * 电脑
 * </p>
 *
 * @author Administrator
 * @version 1.0
 * @since 2019-04-01 19:57
 **/
public class 电脑 {
    public static void main(String[] args) {
        多功能插排 插排 = new 插排适配器();
        插排.两口插座();
        插排.三口插座();
    }
}
