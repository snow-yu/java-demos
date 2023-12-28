package com.snow.aop.proxy;

/**
 * 拼多多商家 代理手机厂商购买手机
 * @author jiaXue
 * date 2023/12/28
 */
public class PinduoduoShop implements PhoneSell{

    // 声明 商家代理的厂家是谁
    private final PhoneFactory phoneFactory = new PhoneFactory();

    /**
     * 实现卖手机功能
     * @param amount 购买数量
     */
    @Override
    public void sell(int amount) {
        System.out.println("购买之前商家 执行一些逻辑， 比较校验商品数目等");
        phoneFactory.sell(amount);
        System.out.println("购买之后商家 执行一些逻辑，比如通知短信、变更订单状态等");
    }
}
