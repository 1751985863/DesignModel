package com.hu;

import com.nanfeng.FileParse;
import com.nanfeng.ZipFileParse;
import org.junit.jupiter.api.Test;

/**
 * 模板方式模式
 */
public class ParsingTest {
    @Test
    public void test() {
        FileParse fileParse = new newPare1();
        fileParse.run("20221112");
    }
}
