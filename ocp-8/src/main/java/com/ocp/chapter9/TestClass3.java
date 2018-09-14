/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter9;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author Dhiraj
 * @date 12/09/18
 */
public class TestClass3 {
    public static void main(String[] args) throws IOException {
        Path path= Paths.get("/zoo/animals/bear/koala/food.txt");
        System.out.println(path.subpath(1,3).getName(1).toAbsolutePath());

        Path path1= Paths.get("./zoo");
        if (Files.isDirectory(path1) && Files.isSymbolicLink(path1))
            Files.createDirectory(path1.resolve("joey"));
        System.out.println(Files.isDirectory(path1));
        System.out.println(Files.isSymbolicLink(path1));
    }
}
