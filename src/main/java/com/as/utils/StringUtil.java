package com.as.utils;

import java.util.UUID;

public class StringUtil {

    // 获取文件的后缀名
    public static String getSuffixName(String fileName) {
        return fileName.substring(fileName.lastIndexOf("."));
    }
    // 获取随机32位字符序列
    public static String randomFileName() {
        return UUID.randomUUID().toString().replace("-", "");
    }
}
