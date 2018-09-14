/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware.test3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author Dhiraj
 * @date 11/09/18
 */
public class TestClass28 {
    public static void main(String[] args) throws IOException {
        /*Path p1= Paths.get("c://test//..//test");
        Path p2= Paths.get("c://test//testa");
        *///Path p2= Paths.get("/test/testa");
        /*Path p1= Paths.get("/users/home1/test/../dir1/../dir2");
        Path p2= Paths.get("/users/home2");
        System.out.println(p1.relativize(p2));
        System.out.println(p2.relativize(p1));
        System.out.println(p1.resolve(p2));
        System.out.println(p1.normalize());
        System.out.println(p2.normalize());

        System.out.println(p1.subpath(0,5));*/
        //Path path= Files.createDirectories(Paths.get("/Users/300012951/work/learning/java8/java-8-certification/ocp-8/dir1/dir2"));
        Path p1 = Paths.get("./test.txt");
        Path p2 = Paths.get("./test-renamed.txt");

        Path p3 = Paths.get("");
        //System.out.println(p1.toAbsolutePath());
        //Files.copy(p1,p2);
        //Files.move(p2,p1);
        //Files.move(p1,Paths.get("./test.txt"));

        Path p4 = Paths.get("/Users/300012951/work/official/softwares/kibana-6.2.4-darwin-x86_64/plugins/x-pack/node_modules/babel-runtime/node_modules/core-js/modules/_array-reduce.js");
        //Files.readAllLines(p4).stream().forEach(System.out::println);

        try (BufferedReader br = Files.newBufferedReader(p4);
             BufferedWriter bw = Files.newBufferedWriter(p2);
        ) {
            String line = null;
            while ((line = br.readLine()) != null) {
                bw.write(line);
                // bw.write("\n");
            }

        }
    }
}
