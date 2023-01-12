package com.nanfeng;

public class TxtFileParse extends FileParse{
    @Override
    protected void save() {
        System.out.println("正在入库保存");

    }

    @Override
    protected void parseFile() {
        System.out.println("txt文件解析中");

    }

    @Override
    protected void downloadFile(String yyyyMMdd) {
        String regx = "/*.txt";
        System.out.println("文件规则："+regx);

    }
}
