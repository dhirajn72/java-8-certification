/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter9;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author Dhiraj
 * @date 19/09/18
 */
public class TestClass17 {
    public static void main(String[] args) throws IOException {
        Path path= Paths.get("fish.txt");
        Path path1= Paths.get("birds.txt");
        System.out.println(path.relativize(path1));//   ../birds.txt
        System.out.println(path1.relativize(path));//   ../fish.txt

        Path path2= Paths.get("/../test1/test/fish.txt");
        Path path3= Paths.get("/../test/test/birds.txt");
        System.out.println(path2.relativize(path3));//   ../birds.txt
        System.out.println(path3.relativize(path2));//   ../fish.txt

        Path path4= Paths.get("/usr/bin");
        System.out.println(path4.toRealPath());
        //Path path5= Paths.get("zoo.properties");
        //System.out.println(path5.toRealPath());
        System.out.println(System.getProperty("user.dir"));
        Path path5= Paths.get("ocp-8/test/test/deleteme/test");
        System.out.println(Files.createDirectories(path5));

        Path path6=Paths.get(".").normalize();
        System.out.println(">>>>>"+path6);
        System.out.println(path6.getNameCount());




    }
}
