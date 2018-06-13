/*
 * All Rights Reserved @Dhiraj
 */

package com.java.core.org;

/**
 * @author Dhiraj
 * @date 01/06/18
 */
public class ClassLoaderTest {
    public static void main(String[] args) {
        System.out.println(String.class.getClassLoader());
        System.out.println(ClassLoaderTest.class.getClassLoader());
        double d = 0XFACE;
        System.out.println(d);
        System.out.println(5 / 4);
        System.out.println('0' == 0);
        System.out.println('0' == 48);
        String[] strArr = new String[0];
        System.out.println(strArr.length);
        //System.out.println(strArr[0]);

        int s = 5;
        s += s + mx(s) + ++s;
        System.out.println(s);

    }

    static int mx(int s) {
        for (int i = 0; i < 3; i++) {
            s = s + i;
        }
        return s;
    }
}
