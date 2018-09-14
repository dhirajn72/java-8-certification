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
 * @date 11/09/18
 */
public class TestClass31 {
    public static void main(String[] args) throws IOException {
        Path p1= Paths.get("./ocp-8/src");
        System.out.println(Files.exists(p1));
        //System.out.println(System.getProperty("user.dir"));
        Files.walk(p1,5).filter(path -> path.toString().endsWith(".java")).forEach(System.out::println);
    }
}
