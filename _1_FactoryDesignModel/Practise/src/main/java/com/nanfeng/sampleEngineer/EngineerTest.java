package com.nanfeng.sampleEngineer;

import org.junit.jupiter.api.Test;

public class EngineerTest {

    @Test
    public void test() {
        EngineerFactory.createEngineer(2).watchLog();
    }
}
