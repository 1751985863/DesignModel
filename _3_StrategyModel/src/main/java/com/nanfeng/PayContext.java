package com.nanfeng;

public class PayContext {

    private PayChannel payChannel;

    public PayContext(PayChannel payChannel) {
        this.payChannel = payChannel;
    }

    public void settle(double money) {
        double newMoney = payChannel.trail(money);
        System.out.println("结算结果：" + newMoney);
    }

}
