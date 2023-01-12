package com.nanfeng.abstructfactory;

public class LinuxMaintainer implements Maintainer{
    @Override
    public void fix() {
        System.out.println("linux修复程序");
    }
}
