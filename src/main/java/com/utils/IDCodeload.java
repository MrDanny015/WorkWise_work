package com.utils;

import org.springframework.context.annotation.Bean;

import java.util.Random;
/**
 *
 * @author 丹尼 工具类 ID生成
 * @return
 */
public class IDCodeload {

    /**
     * id生成方法
     * @return
     */
    public static String genItemId() {
        //取当前时间的长整形值包含毫秒
        long millis = System.currentTimeMillis();
        //加上两位随机数
        Random random = new Random();
        int end2 = random.nextInt(99);
        //如果不足两位前面补0
        String str = millis + String.format("%02d", end2);
        return str;
    }
}
