package com.nanfeng;

public class OddSupport extends Support{
    public OddSupport(String name) {
        super(name);
    }

    @Override
    boolean resolve(Trouble trouble) {
        return trouble.getNumber() % 2 == 0;
    }
}
