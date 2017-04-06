package com.py.demo.dateUtil;

import com.py.demo.util.DateUtil;
import org.junit.Test;

import java.util.Date;

/**
 * Created by Administrator on 2016/12/21.
 */
public class TestDateUtil {

    @Test
    public void test() {
//        System.out.println(dateUtil.getDateLong(new Date()));
//        System.out.println(dateUtil.getDateLongCn(new Date()));
//        System.out.println(dateUtil.getDateMD(new Date()));
//        System.out.println(dateUtil.getDateShortLongTimeCn(new Date()));
//        System.out.println(dateUtil.getDateUS(new Date()));
//        System.out.println(dateUtil.getDateUSShort(new Date()));

        System.out.println(DateUtil.getNowDayStr(new Date()));

        System.out.println(DateUtil.dateDayAdd(new Date(), 1));
    }
}
