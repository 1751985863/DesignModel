package com.nanfeng.abstructfactory;



public class JavaFactory implements AbstractFactory {

    @Override
    public Engineer createEngineer() {
        return new JavaEngineer();
    }

    @Override
    public Maintainer createMaintainer() {
        return new JavaMaintainer();
    }
}
