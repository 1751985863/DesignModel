package com.nanfeng.abstructfactory;



public class LinuxFactory implements AbstractFactory{
    @Override
    public Engineer createEngineer() {
        return new LinuxEngineer();
    }

    @Override
    public Maintainer createMaintainer() {
        return new LinuxMaintainer();
    }
}
