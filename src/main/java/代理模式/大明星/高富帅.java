package 代理模式.大明星;

import lombok.extern.slf4j.Slf4j;

/**
 * 当使用动态代理模式的时候
 */

@Slf4j
public class 高富帅 {
    public static void main(String[] args) throws Exception {
        经纪人 经纪人 = new 经纪人();
        大明星 大明星 = 经纪人.联系大明星();
        大明星.约吃饭();
        log.info("------------------------");
        大明星.约逛街();
        //可以打印生成的代理类
//        byte[] $Proxy0s = ProxyGenerator.generateProxyClass("$Proxy0", new Class[]{大明星.class});
//        FileOutputStream fileOutputStream = new FileOutputStream(new File("D:\\123.class"));
//        fileOutputStream.write($Proxy0s);
    }
}
