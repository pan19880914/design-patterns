package 桥接模式;

import lombok.extern.slf4j.Slf4j;

/**
 * <p>
 * 战士
 * </p>
 *
 * @author Administrator
 * @version 1.0
 * @since 2019-04-04 17:05
 **/
@Slf4j
public class 战士 extends 游戏角色 {
    public 战士(桥接模式.游戏角色性别 游戏角色性别) {
        super(游戏角色性别);
    }

    @Override
    public void 创建角色() {
        this.游戏角色性别.创建角色();
        log.info("职业：{}",this.getClass().getSimpleName());
    }
}
