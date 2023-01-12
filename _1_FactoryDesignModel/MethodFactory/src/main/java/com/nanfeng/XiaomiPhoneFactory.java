package com.nanfeng;

public class XiaomiPhoneFactory implements PhoneFactory{
    @Override
    public void productPhone() {
        Phone phone = new XiaomiPhone();
        phone.produce();
    }
}
