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
public class TestClass10 {
    public static void main(String[] args) {
        try {
            //Files.copy(Paths.get("t1"),Paths.get("t1-copy"), StandardCopyOption.REPLACE_EXISTING);
            //Files.copy(Paths.get("t1/t1.txt"),Paths.get("t1-copy/t1-copy.txt"));
            //Files.move(Paths.get("t1"), Paths.get("t1-copy1"));
            //Files.move(Paths.get("t1-copy1"),Paths.get("t1"));
            //Files.move(Paths.get("t1/test.txt"), Paths.get("t3/test-copy.txt"));
            //Files.delete(Paths.get("t1/t2"));
            System.out.println(Files.deleteIfExists(Paths.get("t1/t2")));;

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
