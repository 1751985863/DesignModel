package com.nanfeng;

import org.junit.jupiter.api.Test;

public class StrategyTest {
    @Test
    public void test() {
        PayContext payContext = new PayContext(new WeChatChannel());
        payContext.settle(100);
    }
}
