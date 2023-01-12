package com.nanfeng;

import org.junit.jupiter.api.Test;

/**
 * 模板方式模式
 */
public class ParsingTest {
    @Test
    public void test() {
        FileParse fileParse = new ZipFileParse();
        fileParse.run("20221112");
    }
}
