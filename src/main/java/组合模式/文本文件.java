package 组合模式;

import lombok.extern.slf4j.Slf4j;

/**
 * <p>
 * 文本文件
 * </p>
 *
 * @author Administrator
 * @version 1.0
 * @since 2019-04-04 17:28
 **/
@Slf4j
public class 文本文件 extends 文件 {

    public 文本文件(String 文件名称) {
        super(文件名称);
    }

    public void lock(int n) {
        System.out.println(生成空格(n) +  this.get文件名称());
    }
}
