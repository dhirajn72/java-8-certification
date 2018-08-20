/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware.test3;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author Dhiraj
 * @date 18/08/18
 */
public class TestClass2 {
    public static void main(String[] args) {
        Path p1 = Paths.get("c:\\..\\temp\\test.txt");
        System.out.println(p1.normalize());
        System.out.println(p1.normalize().toUri());

        Path path = Paths.get("c:\\personal\\.\\photos\\..\\readme.txt");
        Path path1 = Paths.get("c:\\personal\\index.html");
        Path path2 = path.relativize(path1);
        System.out.println(path2);

        Path path3=Paths.get("/a/b");
        Path path4=Paths.get("/a/b/c/d");

        System.out.println(path3.relativize(path4 )); //        c/d
        System.out.println(path4.relativize(path3 )); //        ../..

    }
}
