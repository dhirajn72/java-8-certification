/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware.test2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author Dhiraj
 * @date 17/08/18
 */
public class TestClass8 {
    public static void main(String[] args) {
        try {
            Path path= Paths.get("/data");
            Path path1= Paths.get("/user/home");
            System.out.println(Paths.get("/usr/bin").toRealPath(LinkOption.NOFOLLOW_LINKS));
            System.out.println(Files.exists(Paths.get("/usr/bin")));
            System.out.println(Files.isSameFile(Paths.get("b.ser"),Paths.get("p.ser")));
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
