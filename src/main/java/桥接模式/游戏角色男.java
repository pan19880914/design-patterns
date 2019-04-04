package 桥接模式;

import lombok.extern.slf4j.Slf4j;

/**
 * <p>
 * 游戏角色男
 * </p>
 *
 * @author Administrator
 * @version 1.0
 * @since 2019-04-04 16:58
 **/
@Slf4j
public class 游戏角色男 implements 游戏角色性别 {
    @Override
    public void 创建角色() {
        log.info("创建男性角色...");
    }
}
