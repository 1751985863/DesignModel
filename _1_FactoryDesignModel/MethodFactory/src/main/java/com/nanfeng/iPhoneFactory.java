package com.nanfeng;

public class iPhoneFactory implements PhoneFactory{
    @Override
    public void productPhone() {
        Phone phone = new iPhone();
        phone.produce();

    }
}
