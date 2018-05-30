/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware;

import com.enthuware.mock1.Super;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author Dhiraj
 * @date 30/05/18
 */


public class DateTest {
    public static void main(String[] args) {
        LocalDateTime greatDay = LocalDateTime.parse("2015-01-01T17:13:50");//"2015-01-01"
        String greatDayStr = greatDay.format(DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(greatDayStr);
    }
}
class Sub extends Super{
    void m1() {
    }
}

interface  Inter1{
    void m1();
}
class Sub2 implements  Inter1{
    public void m1() {

    }
}
