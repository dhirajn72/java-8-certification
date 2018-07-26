/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter8;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


/**
 * @author Dhiraj
 * @date 18/07/18
 */
public class TestClass5 {
    public static void main(String[] args) throws IOException {

        Path p= Paths.get("pool-1-thread-1.txt");
        Path p1=Paths.get("Thread-0.txt");
        try(InputStream inputStream= new BufferedInputStream(new FileInputStream(p.toFile()));
            OutputStream  outputStream= new BufferedOutputStream(new FileOutputStream(p1.toFile()))
        ) {
            Files.copy(p,outputStream);

            new File("text1/text2/b.ser").mkdirs();
            Files.createDirectories(Paths.get("../tesxt1"));
            //Files.createDirectory(Paths.get("tesxt1"));
            //Files.copy(Paths.get("text1/a.txt"),Paths.get("text/a.txt"));
            //Files.delete(Paths.get("text1/a.txt"));

        }
        System.out.println("Done!!");
    }
}
