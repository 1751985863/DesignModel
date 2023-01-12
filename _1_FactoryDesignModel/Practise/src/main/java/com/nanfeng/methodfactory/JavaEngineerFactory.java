package com.nanfeng.methodfactory;

import com.nanfeng.sampleEngineer.Engineer;
import com.nanfeng.sampleEngineer.JavaEngineer;

public class JavaEngineerFactory implements EngineerFactory{

    @Override
    public  Engineer createEngineer() {
        return new JavaEngineer();
    }
}
