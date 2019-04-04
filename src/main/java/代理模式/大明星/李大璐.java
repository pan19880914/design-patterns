package 代理模式.大明星;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class 李大璐 implements 大明星 {
    @Override
    public void 约吃饭() {
        log.info("开始吃饭。");
    }

    @Override
    public void 约逛街() {
        log.info("开始逛街。");
    }
}
