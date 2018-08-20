/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter8;

import java.io.*;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author Dhiraj
 * @date 17/07/18
 */
public class TestClass3 {
    public static void main(String[] args) throws IOException, ClassNotFoundException, URISyntaxException {
        //Path p=Paths.get("b.ser");
        //Path p1=Paths.get("singleton.ser");
        Path p1=Paths.get("file:///Users/300012951/work/learning/java8/java-8-certification/b.ser");

        //Path p=Paths.get(new URI("file:///Users/300012951/work/learning/java8/java-8-certification/b.ser"));
        Path p=Paths.get(/*new URI(*/"file:///Users/300012951/work/learning/java8/java-8-certification/b.ser");
        //file:///Users/300012951/work/learning/java8/java-8-certification/b.ser
        URI uri=p.toUri();
        Path path= FileSystems.getDefault().getPath("b.ser");
        File f=p.toFile();

        try(ObjectInputStream objectInputStream=new ObjectInputStream(new FileInputStream(new File(path.toUri()/*p.toUri()*/)))) {
            Object ob=objectInputStream.readObject();
            if (ob instanceof B){
                B b=(B)ob;
                System.out.println(b);
            }
            System.out.println(uri.toURL());
            System.out.println(path.toUri());
        }
        System.out.println("********");
        System.out.println(p.getFileName());
        Path curr=p;
       // do
            while ((curr=curr.getParent())!=null)
                System.out.println("Current parrent is:"+curr.getParent());
        //while (true);

        System.out.println("@@@@@@");
        //Path p=Paths.get(/*new URI(*/"file:///Users/300012951/work/learning/java8/java-8-certification/b.ser");
        System.out.println(p.subpath(0,7));
        System.out.println(p.subpath(2,3));
        System.out.println(p.subpath(6,7));
        System.out.println(p.subpath(1,6));
        System.out.println("******");
        System.out.println(p.relativize(p1));
        System.out.println(p.resolve(p1));







    }
}
