package com.nanfeng;

public class XiaomiFactory implements AbstractFactory{
    @Override
    public void producePhone() {
        Phone xiaomiPhone = new XiaomiPhone();
        xiaomiPhone.produce();
    }

    @Override
    public void producePad() {
        Pad xiaomiPad = new XiaomiPad();
        xiaomiPad.produce();
    }
}