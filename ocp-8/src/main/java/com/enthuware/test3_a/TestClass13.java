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
public class TestClass13 {
    public static void main(String[] args) {
        Path p1 = Paths.get("/personal/./photos/../readme.txt");
        Path p2 = p1.normalize();
        System.out.println(p2);
        Path p3 = Paths.get("/personal/../photos/../readme.txt");
        System.out.println(p3.normalize());
        Path p4 = Paths.get("/personal/photos/../dir1/./dir2/../readme.txt");
        System.out.println(p4.normalize());//   /personal/readme.txt



    }
}
