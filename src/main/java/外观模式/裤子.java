package 外观模式;

import lombok.extern.slf4j.Slf4j;

/**
 * <p>
 * 裤子
 * </p>
 *
 * @author Administrator
 * @version 1.0
 * @since 2019-04-04 15:57
 **/
@Slf4j
public class 裤子 {
    protected void on(){
        log.info("穿上{}...",this.getClass().getSimpleName());
    }

    protected void off(){
        log.info("脱下{}...",this.getClass().getSimpleName());
    }
}
