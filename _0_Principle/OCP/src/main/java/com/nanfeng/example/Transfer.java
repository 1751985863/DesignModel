package com.nanfeng.example;

public class Transfer implements Business {
    @Override
    public void operate() {
        System.out.println("转账业务");
    }
}