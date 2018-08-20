/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware.test2;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author Dhiraj
 * @date 17/08/18
 */
public class TestClass6 {
    public static void main(String[] args) {
        Path path=Paths.get("fish.txt");
        Path path1=Paths.get("birds.txt");
        System.out.println(path.relativize(path1));
        System.out.println(path1.relativize(path));


        Path path2=Paths.get("/usr/bin/hostinfo");
        Path path3=Paths.get("/usr/bin/host");
        System.out.println(path2.relativize(path3));
        System.out.println(path3.relativize(path2));

        Path path4=Paths.get("/home/fish.txt"); //
        Path path5=Paths.get("/home/test/birds.txt");
        System.out.println(path4.relativize(path5)); //     ../test/birds.txt
        System.out.println(path5.relativize(path4)); //     ../../fish.txt

        System.out.println("******");
        Path path6= Paths.get("/cats/../panther");
        Path path7= Paths.get("/food");
        System.out.println(path6.resolve(path7));
        System.out.println(path7.resolve(path6));
    }
}
