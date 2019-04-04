package 装饰器模式.无;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class 程序员 {
    public static void main(String[] args) {
        鸡蛋灌饼 鸡蛋灌饼 = new 鸡蛋灌饼();
        log.info("{},总价：{}" ,鸡蛋灌饼.名称(),鸡蛋灌饼.价格());
        鸡蛋灌饼 = new 加鸡蛋灌饼();
        log.info("{},总价：{}" ,鸡蛋灌饼.名称() , 鸡蛋灌饼.价格());
        鸡蛋灌饼 = new 加香肠灌饼();
        log.info("{},总价：{}" ,鸡蛋灌饼.名称() , + 鸡蛋灌饼.价格());
    }
}
