package 代理模式.大明星;

import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

@Slf4j
public class 经纪人 implements InvocationHandler {

    private 大明星 大明星;

    public 大明星 联系大明星(){
        this.大明星 = new 李大璐();
        return (大明星) Proxy.newProxyInstance(大明星.class.getClassLoader(), new Class<?>[]{大明星.class}, this);
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        前处理();
        method.invoke(大明星, args);
        后处理();
        return null;
    }

    private void 前处理(){
        log.info("了解对象，是否提供服务。");
    }
    private void 后处理(){
        log.info("专车回家。");
    }
}
