package 装饰器模式.有;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class 程序员 {
    public static void main(String[] args) {
        灌饼 灌饼 = new 鸡蛋灌饼();
        灌饼 = new 加鸡蛋装饰器(灌饼);
        灌饼 = new 加鸡蛋装饰器(灌饼);
        灌饼 = new 加香肠装饰器(灌饼);
        log.info("名称：{}", 灌饼.名称());
        log.info("总价：{}", 灌饼.价格());
    }
}


