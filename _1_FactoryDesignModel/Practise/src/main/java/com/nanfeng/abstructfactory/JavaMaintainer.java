package com.nanfeng.abstructfactory;

public class JavaMaintainer implements Maintainer {
    @Override
    public void fix() {
        System.out.println("维护java程序");
    }
}
