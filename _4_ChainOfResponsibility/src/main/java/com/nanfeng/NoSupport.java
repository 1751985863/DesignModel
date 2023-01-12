package com.nanfeng;

public class NoSupport extends Support{

    public NoSupport(String name) {
        super(name);
    }
    @Override
    boolean resolve(Trouble trouble) {
        return false;
    }
}
