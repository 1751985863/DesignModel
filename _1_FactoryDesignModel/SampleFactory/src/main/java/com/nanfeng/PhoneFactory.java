package com.nanfeng;

public class PhoneFactory {
    public static Phone productPhone(String type) {
        switch (type) {
            case "xiaomi":
                return new XiaomiPhone();
            case "huawei":
                return new HuaWeiPhone();
            case "apple":
                return new iPhone();
            default:
                return null;
        }
    }
}
