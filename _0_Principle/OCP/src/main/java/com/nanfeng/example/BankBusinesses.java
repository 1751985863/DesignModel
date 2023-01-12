package com.nanfeng.example;

/**
 * 银行业务类
 */
public class BankBusinesses {
    /**
     * 处理银行业务
     * @param business
     */
    public void operate(Business business) {
        System.out.println("处理银行业务");
        business.operate();
    }
}