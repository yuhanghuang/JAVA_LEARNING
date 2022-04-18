package com.hyh.format;

import java.util.Calendar;
import java.util.Date;

public class TestFormatDrive {
    public static void main(String[] args) {
        int one = 102202020;
        double two = 12345.44884;
        System.out.println(String.format("%,.1f",42.000));
        System.out.println(String.format("The rank is %,d out of %,.2f",one,two));
        System.out.println(String.format("%tc",new Date()));
        System.out.println(String.format("%tr",new Date()));
        Date today = new Date();
        System.out.println(String.format("%tY,%tA,%tB,%td",today,today,today,today));
        System.out.println(String.format("%tY,%<tA,%<tB,%<td",today));
//        Calendar cal1 = new Calendar();
        Calendar cal = Calendar.getInstance();
        System.out.println(cal.getTimeZone());
        System.out.println(Calendar.getInstance().getTime());

    }
}
