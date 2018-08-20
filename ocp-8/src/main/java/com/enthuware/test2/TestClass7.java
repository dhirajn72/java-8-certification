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
public class TestClass7 {
    public static void main(String[] args) {
        Path path= Paths.get("/data");
        Path path1= Paths.get("/user/home");
        Path path2=path.relativize(path1);
        //System.out.println(path2);  //       ../user/home
        //System.out.println(path1.relativize(path));    //   ../../data
        System.out.println(path.resolve(path2)); //           /data/../user/home
        System.out.println(path.resolve(path2).normalize()); //    /data/user/home
    }
}
