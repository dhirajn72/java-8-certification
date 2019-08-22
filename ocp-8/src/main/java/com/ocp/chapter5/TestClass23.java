/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.DateTimeException;
import java.time.LocalDate;

/**
 * @author Dhiraj
 * @date 16/09/18
 */
public class TestClass23 {
    public static void main(String[] args) {
        try {
            Path path = Paths.get("test.txt");
            String text = new String(Files.readAllBytes(path));
            LocalDate localDate = LocalDate.parse(text);
            System.out.println(localDate);
            //throw new IllegalArgumentException(text);
        } catch (DateTimeException | IOException e) {
            System.out.println("DateTimeException |IOException e");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Exception_1");
            e.printStackTrace();
        }
    }
}