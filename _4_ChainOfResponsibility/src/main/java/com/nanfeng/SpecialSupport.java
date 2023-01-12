package com.nanfeng;

public class SpecialSupport extends Support{

    private int specialNumber;
    public SpecialSupport(String name,int specialNumber) {
        super(name);
        this.specialNumber = specialNumber;
    }
    @Override
    boolean resolve(Trouble trouble) {
        return trouble.getNumber() == specialNumber;
    }
}
