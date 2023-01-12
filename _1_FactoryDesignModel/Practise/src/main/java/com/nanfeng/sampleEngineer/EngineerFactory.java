package com.nanfeng.sampleEngineer;

public class EngineerFactory {

    public static Engineer createEngineer(int type) {
        switch (type) {
            case 1:
                return new JavaEngineer();
            case 2:
                return new LinuxEngineer();
            default:
                return null;
        }
    }
}
