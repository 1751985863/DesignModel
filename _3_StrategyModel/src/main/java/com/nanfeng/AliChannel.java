package com.nanfeng;

public class AliChannel extends PayChannel{
    @Override
    double trail(double money) {
        System.out.println("蚂蚁支付中");
        return money*0.98;
    }
}
