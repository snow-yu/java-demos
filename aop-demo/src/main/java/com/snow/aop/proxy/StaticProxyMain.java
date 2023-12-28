package com.snow.aop.proxy;

/**
 * 静态代理测试类
 * 静态代理原理
 * 1. 代理类是自己实现的
 * 2. 实现要代理的目标
 * 举例：厂家：生产手机，商家：代理卖手机 客户：通过商家购买手机
 *
 * @author jiaXue
 * date 2023/12/28
 */
public class StaticProxyMain {

    /**
     * 客户购买手机
     * @param args
     */
    public static void main(String[] args) {
        // 创建代理的商家
        PinduoduoShop pinduoduoShop = new PinduoduoShop();
        pinduoduoShop.sell(2);
        System.out.println("购买成功");

    }
}
