/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware.test3_a;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.NavigableMap;
import java.util.TreeMap;

/**
 * @author Dhiraj
 * @date 01/09/18
 */


public class TestClass2 {

    public static void main(String[] args) {

        NavigableMap<String, String> mymap = new TreeMap<>();
        mymap.put("a", "apple"); mymap.put("b", "boy"); mymap.put("c", "cat");
        mymap.put("aa", "apple1"); mymap.put("bb", "boy1"); mymap.put("cc", "cat1");

        System.out.println(mymap);

        System.out.println( mymap.pollLastEntry());; //LINE 1 cc
        System.out.println(mymap.pollFirstEntry());; //LINE 2 a
        System.out.println(mymap);

        NavigableMap<String, String> tailmap = mymap.tailMap("bb", false); //LINE 3
        System.out.println(tailmap);
        System.out.println(mymap.remove("c"));

        System.out.println(tailmap.pollFirstEntry()); //LINE 4
        System.out.println(mymap.size()); //LINE 5
        System.out.println(tailmap);
        System.out.println(mymap);


        Path p1=Paths.get("/a/b/c.java");
        System.out.println(p1.getName(4));

    }
}