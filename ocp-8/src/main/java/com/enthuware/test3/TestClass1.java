/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware.test3;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author Dhiraj
 * @date 18/08/18
 */
public class TestClass1 {
    static Path p1 = Paths.get("/Users/300012951/work/learning/java8/java-8-certification/Thread-0.txt");

    public static String getRoot() {
        String root = p1.getRoot().toString();
        return root;
    }

    public static void main(String[] args) {
        System.out.println(getRoot());

        Path p1 = Paths.get("c:\\personal\\.\\photos\\..\\readme.txt");
        Path p2 = p1.normalize();
        System.out.println("Normalized:\"c:\\personal\\.\\photos\\..\\readme.txt\">>>>>>>> "+p2);
        System.out.println("***");
        Path p=Paths.get(/*new URI(*/"file:///Users/300012951/work/learning/java8/java-8-certification/b.ser");
        System.out.println(p.subpath(0,7));
        System.out.println(p.subpath(2,3));
        System.out.println(p.subpath(6,7));
        System.out.println(p.subpath(1,6));

    }
}
