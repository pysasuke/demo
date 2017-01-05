package com.py.demo.DateUtil;

import com.py.demo.util.DateUtil;
import org.junit.Test;

import java.util.Date;

/**
 * Created by Administrator on 2016/12/21.
 */
public class TestDateUtil {

    @Test
    public void test() {
//        System.out.println(DateUtil.getDateLong(new Date()));
//        System.out.println(DateUtil.getDateLongCn(new Date()));
//        System.out.println(DateUtil.getDateMD(new Date()));
//        System.out.println(DateUtil.getDateShortLongTimeCn(new Date()));
//        System.out.println(DateUtil.getDateUS(new Date()));
//        System.out.println(DateUtil.getDateUSShort(new Date()));

        System.out.println(DateUtil.getNowDayStr(new Date()));

        System.out.println(DateUtil.dateDayAdd(new Date(), 1));
    }
}
