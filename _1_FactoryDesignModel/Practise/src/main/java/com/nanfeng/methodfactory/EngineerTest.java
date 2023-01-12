package com.nanfeng.methodfactory;

import org.junit.jupiter.api.Test;

public class EngineerTest {

    @Test
    public void test() {
        EngineerFactory engineerFactory = new LinuxEngineerFactory();
        engineerFactory.createEngineer().watchLog();
    }
}
