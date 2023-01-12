package com.nanfeng;

public class HuaWeiPhoneFactory implements PhoneFactory{
    @Override
    public void productPhone() {
        Phone phone = new HuaWeiPhone();
        phone.produce();

    }
}
