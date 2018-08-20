/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware.test2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.UserPrincipal;

/**
 * @author Dhiraj
 * @date 18/08/18
 */
public class TestClass15 {
    public static void main(String[] args) throws IOException {
        Path path= Paths.get("/Users/300012951/Desktop/Untitled-3");
        UserPrincipal userPrincipal=Files.getOwner(path);
        System.out.println(userPrincipal.getName());
        UserPrincipal owner=path.getFileSystem().getUserPrincipalLookupService().lookupPrincipalByName("300012951");
        Path path1=Files.setOwner(path,owner);
        System.out.println(path1);
        System.out.println(Files.getOwner(path));
    }
}
