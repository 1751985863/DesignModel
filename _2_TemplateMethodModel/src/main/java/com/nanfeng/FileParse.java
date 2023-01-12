package com.nanfeng;

import org.junit.platform.commons.util.StringUtils;

import java.io.InputStream;
import java.util.Date;


public abstract class FileParse {
    public void run(String yyyyMMdd) {
        System.out.println("定时任务开始");
        // 1.处理一下时间
        yyyyMMdd = dataProcessing(yyyyMMdd);
        // 2.下载文件到本地
        downloadFile(yyyyMMdd);
        // 3.获取文件并解析
        parseFile();
        // 4.文件解析入库
        save();
        // 5.删除本地文件
        deleteFile();
        System.out.println("定时任务结束");
    }

    protected abstract void save();
    protected abstract void parseFile();



    private String dataProcessing(String yyyyMMdd) {
        if (StringUtils.isNotBlank(yyyyMMdd)) {
            return yyyyMMdd;
        }
        return new Date().toString();
    }

    /**
     * 下载文件到本地
     * @param yyyyMMdd
     */
    protected abstract void downloadFile(String yyyyMMdd);

    public void deleteFile() {
        System.out.println("删除本地文件");
    }
}
