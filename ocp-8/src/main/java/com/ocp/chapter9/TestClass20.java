/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter9;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author Dhiraj
 * @date 23/09/18
 */
public class TestClass20 {
    static Path p1 = Paths.get("c:\\main\\project\\Starter.java");

    public static String getRoot(){
        String root = p1.getRoot().toString();
        return root;
    }

    public static void main(String[] args) {
        System.out.println(getRoot());
    }
}
