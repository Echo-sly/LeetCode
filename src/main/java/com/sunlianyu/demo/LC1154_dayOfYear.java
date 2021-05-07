package com.sunlianyu.demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Demo LC1154_dayOfYear
 *
 * @author sunlianyu
 * @date 5月7日 12:33
 */
public class LC1154_dayOfYear {
    /**
     * @param date
     * @return int 一年中的第多少天
     * 直接用java 的工具类
     */
    public static int dayOfYear(String date) {
        Calendar c = Calendar.getInstance();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date d = simpleDateFormat.parse(date);
            c.setTime(d);
            return c.get(Calendar.DAY_OF_YEAR);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(dayOfYear("2004-03-01"));
    }
}
