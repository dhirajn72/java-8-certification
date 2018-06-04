/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware.mock3;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Dhiraj
 * @date 04/06/18
 */

public class TestClass {
    public static void main(String args[]) {
        StringBuilder sb = new StringBuilder("12345678");
        sb.setLength(5);
        //sb.setLength(10);
        System.out.println(sb.length() + " " + sb);

        //byte b=320;
        //System.out.println(b);

        java.time.LocalDate dt = java.time.LocalDate.parse("2015-01-01").minusMonths(1).minusDays(1).plusYears(1);
        //2014-12-01
        //2014-11-30
        //2015-11-30
        System.out.println(dt);


        List s1 = new ArrayList();
        s1.add("a");
        s1.add("b");
        s1.add("c");
        s1.add("a");
        if (s1.remove("a")) {
            if (s1.remove("a")) {
                s1.remove("b");
            } else {
                s1.remove("c");
            }
        }
        System.out.println(s1);
    }
}
