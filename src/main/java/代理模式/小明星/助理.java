package 代理模式.小明星;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class 助理 implements 小明星{

    private 小明星 何姐;

    public 助理(){
        this.何姐 = new 何姐();
    }

    private void 前处理(){
        log.info("了解对象，是否提供服务。");
    }
    private void 后处理(){
        log.info("专车回家。");
    }

    public void 约吃饭() {
        前处理();
        何姐.约吃饭();
        后处理();
    }
}
