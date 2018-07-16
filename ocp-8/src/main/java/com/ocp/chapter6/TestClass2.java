/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter6;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.function.Consumer;

/**
 * @author Dhiraj
 * @date 11/07/18
 */
public class TestClass2 {
    public static void main(String[] args) throws IOException {
        Consumer consumer=System.out::println;
        Path path= Paths.get("zoo_hi_.properties");
        String s=new String(Files.readAllBytes(path));
        consumer.accept(s);
    }
}
