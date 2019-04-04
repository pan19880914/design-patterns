package 组合模式;

import lombok.extern.slf4j.Slf4j;

/**
 * <p>
 * 操作文件
 * </p>
 *  组合模式：将对象组合成树形结构以表示“部分-整体”的层次结构，使得用户对单个对象和组合对象的使用具有一致性。
 * @author Administrator
 * @version 1.0
 * @since 2019-04-04 17:23
 **/
@Slf4j
public class 操作文件 {
    public static void main(String[] args) {
        文件夹 文件夹 = new 文件夹("一层目录");
        文件夹 二层文件夹 = new 文件夹("二层目录");
        文件夹.添加文件(二层文件夹);
        二层文件夹.添加文件(new 文本文件("二层文本文件.txt"));
        文件夹.添加文件(new 文本文件("一层文本文件.txt"));
        文件夹.lock(1);
    }
}
