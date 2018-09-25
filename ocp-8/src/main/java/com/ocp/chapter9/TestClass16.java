/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter9;

import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author Dhiraj
 * @date 19/09/18
 */
public class TestClass16 {
    public static void main(String[] args) {
        Path path= Paths.get("c:","test","test");
        System.out.println(path);
        System.out.println(/*FileSystems.getDefault().*/ Paths.get("zoo.properties").toAbsolutePath());
        System.out.println(path.toFile().toPath());
        System.out.println(path.toFile());
        System.out.println(Paths.get("/zoo/../home").getParent().normalize().toAbsolutePath());

        System.out.println("*******");
        Path path1=Paths.get("/zoo/animals/dog/puppy/labradore.txt");
        doTask(path1);
        Path path2=Paths.get("zoo/animals/dog/puppy/labradore.txt");
        doTask(path2);


    }

    private static void doTask(Path path1) {
        Path path2=path1;
        System.out.println(path2.getFileName());
        System.out.println(path2.getRoot());
        while ((path2=path2.getParent())!=null){
            System.out.println("current parent is::"+path2);
        }
        System.out.println("*****");
    }
}
