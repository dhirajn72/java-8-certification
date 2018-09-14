/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter9;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;

/**
 * @author Dhiraj
 * @date 12/09/18
 */
public class TestClass2 {
    public static void main(String[] args) throws IOException {
        /*Path path= Paths.get("/user/.././root","../kodiacbear.txt");
        Path path1=path.normalize().relativize(Paths.get("/lion"));
        System.out.println(path);
        System.out.println(path1);*/

        Path path2=Paths.get("/Users/300012951/work/learning/java8/java-8-certification");
        BasicFileAttributes attributes= Files.readAttributes(path2,BasicFileAttributes.class);
        if (attributes.size()>0 && attributes.creationTime().toMillis()>0);
        BasicFileAttributeView attributeView= Files.getFileAttributeView(path2,BasicFileAttributeView.class);
        System.out.println(attributeView.name());
        attributes=attributeView.readAttributes();
        System.out.println(attributes.fileKey());
        System.out.println(attributes.creationTime());
        System.out.println(attributes.isDirectory());
        System.out.println(attributes.lastAccessTime());


    }
}
