package com.nanfeng.abstructfactory;

import org.junit.jupiter.api.Test;

public class EngineerTest {

    @Test
    public void test() {
        AbstractFactory factory = new LinuxFactory();
       factory.createEngineer().watchLog();
       factory.createMaintainer().fix();

    }
}
