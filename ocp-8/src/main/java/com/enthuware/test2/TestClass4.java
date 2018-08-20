/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware.test2;

import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author Dhiraj
 * @date 17/08/18
 */
public class TestClass4 {
    public static void main(String[] args) throws URISyntaxException {
        Path path= Paths.get(new URI("file:/usr/bin/hostinfo"));
        Path path1= Paths.get(new URI("file:/pandas/hostinfo"));
        //Path path2= Paths.get(new URI("/pandas/hostinfo")); //Throws exception, scheme is mandatory
        //Path path3= Paths.get(new URI("http://www.wiley.com")); //FileSystemNotFoundException: Provider "http" not installed


        System.out.println(path);
        System.out.println(path1);
        //System.out.println(path2);
        //System.out.println(path3.toUri());

        /*FileSystem fileSystem= FileSystems.getFileSystem(new URI("http://www.selikoff.net")); //FileSystemNotFoundException: Provider "http" not installed
        System.out.println(fileSystem);

        Path path2=fileSystem.getPath("test.img");
        System.out.println(path2);*/


    }
}
