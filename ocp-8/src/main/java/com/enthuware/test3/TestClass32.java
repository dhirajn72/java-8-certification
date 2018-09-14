/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware.test3;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author Dhiraj
 * @date 12/09/18
 */
public class TestClass32 {
    public static void main(String[] args) {
        Path p1=Paths.get("/user/.././root","../file1.txt");
        System.out.println(p1.normalize());
        p1=p1.normalize().relativize(Paths.get("/lion"));
        System.out.println(p1);

    }
}
