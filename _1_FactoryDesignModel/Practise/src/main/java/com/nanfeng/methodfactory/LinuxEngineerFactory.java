package com.nanfeng.methodfactory;

import com.nanfeng.sampleEngineer.Engineer;
import com.nanfeng.sampleEngineer.LinuxEngineer;

public class LinuxEngineerFactory implements EngineerFactory{
    @Override
    public Engineer createEngineer() {
        return new LinuxEngineer();
    }
}
