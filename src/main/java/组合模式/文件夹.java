package 组合模式;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 文件夹
 * </p>
 *
 * @author Administrator
 * @version 1.0
 * @since 2019-04-04 17:19
 **/
@Slf4j
public class 文件夹  extends 文件{
    private List<文件> 子文件;

    public 文件夹(String 文件名称) {
        super(文件名称);
        this.子文件 = new ArrayList<>();
    }

    public void 添加文件(文件 文件){
        子文件.add(文件);
    }

    public void 删除文件(文件 文件){
        子文件.remove(文件);
    }
    public void lock(int n) {
        System.out.println(生成空格(n) +  this.get文件名称());
        if (!子文件.isEmpty()){
            子文件.forEach(临时文件 -> {
                临时文件.lock(n + 10);
            });
        }
    }
}
