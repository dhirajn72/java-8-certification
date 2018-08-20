/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware.test2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author Dhiraj
 * @date 18/08/18
 */
public class TestClass19 {
    public static void main(String[] args) throws IOException {
        Path path= Paths.get("/Users/300012951/work/learning/java8/java-8-certification/pom.xml");
        Files.lines(path).forEach(System.out::println);
    }
}
