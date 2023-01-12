package com.nanfeng;

public class WeChatChannel extends PayChannel{
    @Override
    double trail(double money) {
        System.out.println("微信支付中");
        return money*0.99;

    }
}
