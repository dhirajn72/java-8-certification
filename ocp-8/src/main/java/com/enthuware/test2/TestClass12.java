/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware.test2;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author Dhiraj
 * @date 18/08/18
 */
public class TestClass12 {
    public static void main(String[] args) {

        Path path= Paths.get("/Users/300012951/Desktop/Untitled-3-copy.txt");
        try(BufferedWriter writer=Files.newBufferedWriter(path)) {
            writer.write("hello wolrd !!");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
