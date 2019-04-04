package 适配器模式.类适配器模式;

import lombok.extern.slf4j.Slf4j;

/**
 * <p>
 * 插排适配器
 * </p>
 *
 * @author Administrator
 * @version 1.0
 * @since 2019-04-01 19:56
 **/
@Slf4j
public class 插排适配器 extends 插排 implements 多功能插排{
    public void 三口插座() {
        log.info("三口插座...");
    }

    public void 四口插座() {
        log.info("四口插座...");
    }
}
