/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware.test2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.DosFileAttributes;
import java.nio.file.attribute.PosixFileAttributes;

/**
 * @author Dhiraj
 * @date 18/08/18
 */
public class TestClass16 {
    public static void main(String[] args) throws IOException {
        Path path= Paths.get("/Users/300012951/Desktop/Untitled-3");

        //BasicFileAttributes basicFileAttributes=Files.readAttributes(path, BasicFileAttributes.class);
        //BasicFileAttributes basicFileAttributes=Files.readAttributes(path, DosFileAttributes.class);
        BasicFileAttributes basicFileAttributes=Files.readAttributes(path, PosixFileAttributes.class);
        System.out.println(basicFileAttributes.fileKey());
    }
}
