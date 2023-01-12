package com.nanfeng;

import org.junit.Test;

public class PhoneTest {


    @Test
    public void test() {
        PhoneFactory phoneFactory = new HuaWeiPhoneFactory();
        phoneFactory.productPhone();
        PhoneFactory phoneFactory1 = new XiaomiPhoneFactory();
        phoneFactory1.productPhone();
        PhoneFactory phoneFactory2 = new iPhoneFactory();
        phoneFactory2.productPhone();

    }
}
