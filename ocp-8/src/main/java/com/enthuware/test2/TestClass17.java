/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware.test2;

import java.io.IOException;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author Dhiraj
 * @date 18/08/18
 */
public class TestClass17 {
    public static void main(String[] args) throws IOException {
        Path path= Paths.get("/Users/300012951/work/learning/java8/java-8-certification");
        Files.walk(path).filter(f-> f.toString().endsWith(".java")).forEach(System.out::println);
        //Files.walk(path, 6).filter(f-> f.toString().endsWith(".java")).forEach(System.out::println);
        //Files.walk(path).filter(f-> f.toString().endsWith(".java")).filter(f->f.toString().contains("Lab")).forEach(System.out::println);
    }
}
