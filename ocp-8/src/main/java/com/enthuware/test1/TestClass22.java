/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware.test1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author Dhiraj
 * @date 10/09/18
 */
public class TestClass22 {
    public static void main(String[] args) throws IOException, URISyntaxException {

        System.out.println(System.getProperty("user.dir"));
        URI uri=new URI("file:///Users/300012951/work/learning/java8/java-8-certification/test.txt");
        Path path= Paths.get(uri);
        String str="Hello there !";
        BufferedWriter writer=Files.newBufferedWriter(path);
        writer.write(str);
        writer.close();
        System.out.println("writting done !");
        System.out.println("Gonna read !");
        BufferedReader reader=Files.newBufferedReader(path);
        reader.lines().forEach(System.out::println);
        reader.close();
        System.out.println( path.toUri());;
        System.out.println(uri.toURL());

        path=Paths.get("test.txt");
        System.out.println(path.isAbsolute());
        System.out.println(path.toAbsolutePath());

    }
}
