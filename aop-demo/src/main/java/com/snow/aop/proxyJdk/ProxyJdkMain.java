package com.snow.aop.proxyJdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * 动态代理 jdk实现
 * jdk动态代理实现步骤
 * 1.创建接口，定义目标类要完成的功能
 * 2.创建目标类实现接口
 * 3.创建InvocationHandler接口的实现类，在invoke方法中完成代理类的功能
 * 3.1 调用目标的方法
 * 3.2 增强功能
 * 4. 使用Proxy类的静态方法，创建代理对象，并把返回值转为接口类型
 *
 * @author jiaXue
 * date 2023/12/29
 */
public class ProxyJdkMain {

    public static void main(String[] args) {

        // 目标对象
        PhoneSell phoneSell = number -> {
            System.out.println("购买数目:" + number + "对象价格：2");
            return 2;
        };

        ClassLoader classLoader = PhoneSell.class.getClassLoader();
        Class<?>[] interfaces = {PhoneSell.class};

        InvocationHandler invocationHandler = (proxy, method, args1) -> {
            System.out.println("代理类方法执行");
            System.out.println("method.getName() = " + method.getName());
            System.out.println("购买数目 = " + args1[0]);
            // 执行目标方法
            Object price = method.invoke(phoneSell, args1);
            System.out.println("目标类方法执行");
            if (price != null) {
                System.out.println("目标类功能增强");
                return (int)price + 1;
            }
            return null;
        };
        // 代理对象
        PhoneSell phoneSell1 = (PhoneSell) Proxy.newProxyInstance(classLoader, interfaces, invocationHandler);

        // 通过代理执行方法
        System.out.println("实际购买价格：" + phoneSell1.sell(100));
    }


}
