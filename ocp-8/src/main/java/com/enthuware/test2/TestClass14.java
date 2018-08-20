/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware.test2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;
import java.time.Instant;

/**
 * @author Dhiraj
 * @date 18/08/18
 */
public class TestClass14 {
    public static void main(String[] args) throws IOException {
        Path path= Paths.get("/Users/300012951/Desktop/Untitled-3");
        System.out.println(Files.isHidden(path));
        System.out.println(Files.getLastModifiedTime(path));
        FileTime  fileTime=Files.getLastModifiedTime(path);
        System.out.println(fileTime.toInstant());

        Files.setLastModifiedTime(path,FileTime.fromMillis(System.currentTimeMillis()));
        FileTime  fileTime1=Files.getLastModifiedTime(path);
        System.out.println(fileTime1.toInstant());
    }
}
