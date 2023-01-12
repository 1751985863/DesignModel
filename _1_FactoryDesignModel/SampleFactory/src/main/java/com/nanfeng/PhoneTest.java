package com.nanfeng;

import org.junit.Test;


public class PhoneTest {


    @Test
    public void test() {

        PhoneFactory.productPhone("huawei").produce();

        PhoneFactory.productPhone("apple").produce();

    }
}
