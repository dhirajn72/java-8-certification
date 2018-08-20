/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware.test2;

import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author Dhiraj
 * @date 16/08/18
 */
public class TestClass3 {
    public static void main(String[] args) {
        Path path=FileSystems.getDefault().getPath("p.ser");
        System.out.println(path);
        System.out.println(FileSystems.getDefault());
        System.out.println("***");
        Path path1= Paths.get("test","img.png");
        System.out.println(path1);
        Path path2= Paths.get("c:","zoo","info","test","img.png");
        Path path7= Paths.get("zoo","info","test","img.png");
        System.out.println(path2);
        Path path3= Paths.get("/","test","img.png");
        System.out.println(path3);

        System.out.println("*****");
        Path path4=FileSystems.getDefault().getPath("test","img.png");
        System.out.println(path4);
        Path path5=FileSystems.getDefault().getPath("c:","zoo","info","test","img.png");
        System.out.println(path5);
        Path path6=FileSystems.getDefault().getPath("/","test","img.png");
        System.out.println(path6);
        System.out.println("@@@@@");

        System.out.println(path2.getNameCount());
        for (int i=0;i<path2.getNameCount();i++)
            System.out.println("index is:"+i +":" +path2.getName(i));
        System.out.println("&&&&");
        System.out.println(path7.getNameCount());
        for (int i=0;i<path7.getNameCount();i++)
            System.out.println("index is:"+i +":" +path7.getName(i));

    }
}
