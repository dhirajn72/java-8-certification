/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware.test2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * @author Dhiraj
 * @date 18/08/18
 */
public class TestClass18 {
    public static void main(String[] args) throws IOException {
        Path path= Paths.get("/Users/300012951/work/learning/java8/java-8-certification");
        //Stream<Path> pathStream=Files.find(path,10,(x, y)->x.toString().endsWith(".java"));
        //pathStream.forEach(System.out::println);
        Files.list(path)
                .filter(p->
                        {
                            System.out.println(p);
                            return p.startsWith(".");
                        }
                )
                .map(p->p.toAbsolutePath())
                .forEach(System.out::println);
    }
}
