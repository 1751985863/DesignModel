package com.nanfeng;

import org.junit.jupiter.api.Test;

public class SupportTest {

    @Test
    public void test() {

        Trouble trouble = new Trouble();
        trouble.setNumber(9871);
        Support noSupport = new NoSupport("无用机器");
        Support limitSupport = new LimitSupport("限制器",99);
        Support oddSupport = new OddSupport("奇数器");
        Support specialSupport = new SpecialSupport("特备器",987);
        noSupport.setNext(limitSupport).setNext(oddSupport).setNext(specialSupport);

        noSupport.support(trouble);


    }
}
