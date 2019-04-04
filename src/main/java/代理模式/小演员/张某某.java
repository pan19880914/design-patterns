package 代理模式.小演员;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class 张某某 implements 小演员 {
    @Override
    public void 约吃饭(){
        前处理();
        log.info("开始吃饭。");
        后处理();
    }
    private void 前处理(){
        log.info("了解对象，是否提供服务。");
    }
    private void 后处理(){
        log.info("专车回家。");
    }
}
