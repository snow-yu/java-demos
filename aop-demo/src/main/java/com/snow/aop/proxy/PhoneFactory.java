package com.snow.aop.proxy;

/**
 * 目标类：手机厂家， 不接受用户直接购买
 * @author jiaXue
 * date 2023/12/28
 */
public class PhoneFactory implements PhoneSell{


    @Override
    public void sell(int amount) {
        System.out.println("购买数量 = " + amount);
    }
}
