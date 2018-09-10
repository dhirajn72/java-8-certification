/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware.test3_a;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author Dhiraj
 * @date 02/09/18
 */


public class TestClass8 {
    static Path p1 = Paths.get("/a/b/c");

    public static String getValue() {
        String x = p1.getName(1).toString();
        String y = p1.subpath(1, 2).toString();
        return x + " : " + y;
    }

    public static void main(String[] args) {
        System.out.println(getValue());
    }
}