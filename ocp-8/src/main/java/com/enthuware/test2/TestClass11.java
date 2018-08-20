/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware.test2;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author Dhiraj
 * @date 17/08/18
 */
public class TestClass11 {
    public static void main(String[] args) {
        Path path= Paths.get("/Users/300012951/Desktop/Untitled-3");
        try(BufferedReader reader= Files.newBufferedReader(path)) {
            String lines=null;
            while ((lines=reader.readLine())!=null)
                System.out.println(lines);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
