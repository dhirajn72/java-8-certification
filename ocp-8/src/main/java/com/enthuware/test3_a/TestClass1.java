/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware.test3_a;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * @author Dhiraj
 * @date 01/09/18
 */
public class TestClass1 {
    // public void m1(List<? super Number> list)
    public void m1(List<? extends Number> list) {
        //Number n = (Number) list.get(0);
        Number n = list.get(0);
    }

    public static void main(String[] args) {
        /*Path p1 = Paths.get("java1/test1/test2/temp/zoo.txt");
        Path p2 = Paths.get("java2/test1/test3/bin/elephant.bin");*/
        Path p1 = Paths.get("java/test1/test2/temp/zoo.txt");
        Path p2 = Paths.get("java/test1/test3/bin/elephant.bin");


        System.out.println(p1.relativize(p2));
        //      ../../../test3/bin/elephant.bin
        //System.out.println(p1.resolve(p2));
    }
}
