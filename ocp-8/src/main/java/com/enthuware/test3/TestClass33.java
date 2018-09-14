/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware.test3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author Dhiraj
 * @date 12/09/18
 */
public class TestClass33 {
    public static void main(String[] args) throws IOException {
        Path path= Paths.get("/apple");
        Path path1= Paths.get("/ball");

        //System.out.println(Files.isSameFile(path,path1));

        Path path2=Paths.get("/./ocp");
        System.out.println(path2.normalize());
        //System.out.println(System.getProperty("user.dir"));



    }
}
