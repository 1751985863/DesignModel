package com.nanfeng;

public class ZipFileParse extends FileParse{
    @Override
    protected void save() {
        System.out.println("正在入库保存");
    }

    @Override
    protected void parseFile() {
        System.out.println("zip文件解析中");
    }

    @Override
    protected void downloadFile(String yyyyMMdd) {
        String regx = "/*.zip";
        System.out.println("文件规则："+regx);

    }
}
