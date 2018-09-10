/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware.test3_a;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author Dhiraj
 * @date 01/09/18
 */

public class IOTest {
    public static void main(String[] args) {
        Path myfile = Paths.get("test.txt");
        try(BufferedReader bfr = Files.newBufferedReader(myfile, Charset.forName("US-ASCII") )){
            String line = null;
            while( (line = bfr.readLine()) != null){
                System.out.println(line);
            }
        }catch (IOException e) {
           // e.printStackTrace();
            System.out.println(e);
        }
    }
}