package com.frame.common.util;

import java.util.Calendar;
import java.util.Date;

/**
 * @author weining
 * @date 2019/12/12 19:55
 */
public class DateUtil {
    /**
     * 添加过期时间
     * @param y 要保存多少年
     * @return 返回保存后的时间
     */
    public static Date addYear(int y){
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.YEAR,y);
        return calendar.getTime();
    }
}
