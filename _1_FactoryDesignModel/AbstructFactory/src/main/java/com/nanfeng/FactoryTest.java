package com.nanfeng;

import org.junit.Test;

public class FactoryTest {


    @Test
    public void test() {

        AbstractFactory factory = new HuaweiFactory();
        factory.producePad();
    }
}
