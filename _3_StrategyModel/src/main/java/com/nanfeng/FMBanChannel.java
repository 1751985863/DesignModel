package com.nanfeng;

public class FMBanChannel extends PayChannel{
    @Override
    double trail(double money) {
        System.out.println("FM支付中");
        return money*0.7;
    }
}
