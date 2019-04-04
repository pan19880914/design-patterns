package 外观模式;

import lombok.extern.slf4j.Slf4j;

/**
 * <p>
 * 武器
 * </p>
 *
 * @author Administrator
 * @version 1.0
 * @since 2019-04-04 15:56
 **/
@Slf4j
public class 武器 {

    protected void on(){
        log.info("穿上{}...",this.getClass().getSimpleName());
    }

    protected void off(){
        log.info("脱下{}...",this.getClass().getSimpleName());
    }
}
