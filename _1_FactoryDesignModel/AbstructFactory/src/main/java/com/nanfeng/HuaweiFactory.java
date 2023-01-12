package com.nanfeng;

public class HuaweiFactory implements AbstractFactory{
    @Override
    public void producePhone() {
        Phone huaweiPhone = new HuaWeiPhone();
        huaweiPhone.produce();
    }

    @Override
    public void producePad() {
        Pad huaweiPad = new HuaweiPad();
        huaweiPad.produce();
    }
}