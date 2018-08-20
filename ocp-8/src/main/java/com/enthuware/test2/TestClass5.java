/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware.test2;

import java.io.File;
import java.nio.file.Path;

/**
 * @author Dhiraj
 * @date 17/08/18
 */
public class TestClass5 {
    public static void main(String[] args) {
        File file= new File("test.img");
        System.out.println(file);
        Path path=file.toPath();
        System.out.println(path);
        file=path.toFile();
        System.out.println(file);


    }
}
