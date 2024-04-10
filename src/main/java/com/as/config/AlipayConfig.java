package com.as.config;

import java.io.FileWriter;
import java.io.IOException;

public class AlipayConfig {
    // 应用ID,您的APPID，收款账号即是您的APPID对应的支付宝账号,开发时使用沙箱提供的APPID，生产环境改成自己的APPID
    public static String APP_ID = "9021000123605293"; //你的沙箱APPID
    // 商户私钥，您的PKCS8格式RSA2私钥
    public static String APP_PRIVATE_KEY = "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQCOpYJFHE8sruEXIcg7/YaQjPVPoaQ41MGrPusEVCVMZuMQFiNemDoXE7MXj6pJxSSyXURSkiNG+nO4dF/M2mp8BcOGaAlnrvYNv6+3s4XzHBGLvKwbrGb8ZOi7HmLYLq6TjhrFMO7CSoX7cxbPPfOAvhDL8eXUkNVrvMCwiXjv7vqejcca3bAQPSAr/vk7ICang1UnYDZrdyIAISgFeggHWjGKtpScyby89woIQif5x6ETGP/ucaVg5EB53dJjLTQ0VlYrLbaW+72ewVfTgi7o8L5bfsG8i/DEY63UH+xipBxweMFxpXZJVQ6GakMIgQLTXD8YaUvHqJTHmjVDglB3AgMBAAECggEAPSLCSkxvwn7RCdD4uH1YBuvi11Y3xAOrXXGB2EEYGz6dYm+aiRhFDU7sGtT/7s4HhEpk1d68L9d3cT6vMGUL7kuqGRjNrxpVal8VOG5AookNHA6o1NN28AVvmYLUakLXn3XwE0N9kNfPxIz24atziWHsYPwzvH62eY5UJ1VD99CX2GvufCy3BlYO4R2eDceh2DezFL5oc6XMV+Nk4n+sMguN/6fOpEryB6LiG66p7K6udXguEqizEgNC4LohXmDvRTsMxutQ7XciBthhks1PR97Ip+e+2NrwBE1O2TMvMy4RrX/1gprM+DPNVB9mZNYmJOd6yN1xrTf6vJPDp8UfQQKBgQDVjVbtwEslKarhBZoJqtrLPQmuU0UfXEW4/PmCDoj9LufVoh1zFmxKsdkagmlksJ1gJyKLDFUK+YnwH3PGDcP/zo48dinRur9d6vGG9SZxkgCR0fTWmz63ijAf3QDZ3+J2GmmTt8P6NRzwV0c+BWl4i9IBw7oS5a4SWfJtWC0HzQKBgQCrAB421AR6P6AgK0+5uOeqmgA4ZY4ZvQkEHu/4vamr+BfyFOB0wUPLjtPEOaUWvdJKgi1mtk1B3Jz8P1FPs4WEQTsRKIJ5O4iSwqoK86jKWAytretFBvaqwssKXqPq3FHBgB2WjXk40z7+ik8JWSlgeNnv5K/a8hPPmjgl33DtUwKBgQCVHLDjKA8QbuzLXL73Gx7VJNSarbgpMqPYjIOoBYAv0U2+BQmtL64D5fUjJoZy8UOiPRFIqB7FoAJp8XxEgZ4nA1Kb8yI2OMCg0ok9Y/Yo/Pp613CvXQ1I2SvLQ+TxPPwC3WR06a7lCasgQsETFHJV4sOLyeAmi8ulMrstEJG4zQKBgB302lYulE46QToBfGkDzInliq5WlCtMI302UkHYMBYxUziUkbHCfbb2YYDZvGMcg++LmJqKy0QDevjxurPktjoyFz/tQdYtKMLVGWbrwqEYBbiTZEjmbGYD1AAQDlVBnYzxfb13MUpUL4/1+NyhYw9EfKF7BZesmu3ejYGNAEKDAoGBAMNhNuH1Kkj8anZ8cuHztt5sNwl6XXFBg+/FBcatjQF92KJlt8aFpH6zYfWkw84AA6GeMX5mRnTE20IPSWDz41yb1mbp/uB1BNwfqt3GFcSjsdeRKXXDPudnfXCH3BQDFbfJinjFJrDPgP5lPujcRFur3KOnVNegjedr1wpcO7rB";
// 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm对应APPID下的支付宝公钥。
    public static String ALIPAY_PUBLIC_KEY = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAlZxm1SzYmRe1XTc+nuhpsJQDR2lFdB3//CksipY2fw5w8cCajL7pKs7WaGGZ1vSmRzJl1QkfKrU2KVjHEvqxScWobQX0X3yTrpIjhHaTKx2CNxKYFI3+kpBIrmGoS1wT0bBhTOCokGLilRGJQKC+ffAWqms8ETnjthU9PjDMnmZgE5ocb+Fa1k8Yt5nO3lu0SztrwqTLjFTxr64x8DY4kwPqJ5j21ZICNpqRITZoIxEOzWniB7y9fYI6Y9gRYxM5Ck4cljh9SgFnvcj+JLuKt8Fx7gDHp29Aaa17fk6hrz6vfTKt9vi7bB9LYKFvOcB10amRTUDRkug3uKblzsE7YQIDAQAB";
// 服务器异步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
// public static String notify_url ="http://localhost:8080/alipay.trade.page.pay-JAVA-UTF-8/notify_url.jsp";
    public static String notify_url = "http://localhost/springboot2/myPay/toNotify";
    // 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问(其实就是支付成功后返回的页面)
// public static String return_url ="http://localhost:8080/alipay.trade.page.pay-JAVA-UTF-8/return_url.jsp";
    public static String return_url = "http://localhost/springboot2/myPay/succ";
    // 签名方式
    public static String sign_type = "RSA2";
    // 字符编码格式
    public static String CHARSET = "utf-8";
    // 支付宝网关，这是沙箱的网关
    public static String gatewayUrl = "https://openapi-sandbox.dl.alipaydev.com/gateway.do";
    // 日志存放的父级路径
    public static String log_path = "D:\\tmp\\";
//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑
    /**
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" +
                    System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
