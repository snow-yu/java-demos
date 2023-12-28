package com.snow.aop.proxy;

/**
 * 静态代理 手机购买接口
 *
 * @author jiaXue
 * date 2023/12/28
 */
public interface PhoneSell {

    /**
     * 定义一个方法
     *
     * @param amount 购买数量
     */
    void sell(int amount);
}
