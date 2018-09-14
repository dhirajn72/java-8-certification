/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware.test3;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.ZoneId;

/**
 * @author Dhiraj
 * @date 11/09/18
 */
public class TestClass30 {
    public static void main(String[] args) throws IOException {
        Path p1= Paths.get("file1.txt");
        if(!Files.exists(p1))
            Files.createFile(p1);
        try(BufferedWriter writer=Files.newBufferedWriter(p1);){
        for (int i=0;i<1000;i++)
            writer.write("This is line number->"+i+"\n");
        }
        System.out.println("Writting completes !");
        System.out.println(Files.size(p1)/1024 +"MB");
        //Files.move(Paths.get("file-modified.txt"),p1);
        //Files.lines(p1).forEach(System.out::println);
        System.out.println(LocalDateTime.ofInstant(Files.getLastModifiedTime(p1).toInstant(), ZoneId.systemDefault()));
    }
}
