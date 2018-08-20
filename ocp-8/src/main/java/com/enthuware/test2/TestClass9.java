/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware.test2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * @author Dhiraj
 * @date 17/08/18
 */
public class TestClass9 {
    public static void main(String[] args) {

        try {
           System.out.println(System.getProperty("user.dir"));
            //Files.createDirectory(Paths.get("t1/t2"));
            Files.createDirectories(Paths.get("t3/t4/t5"));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
