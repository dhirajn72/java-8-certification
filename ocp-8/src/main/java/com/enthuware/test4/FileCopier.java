/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware.test4;

import java.io.*;

/**
 * @author Dhiraj
 * @date 25/08/18
 */

public class FileCopier {
    public static void copy(String records1, String records2)  {
        try {
            InputStream is = new FileInputStream(records1);
            OutputStream os = new FileOutputStream(records2);
            byte[] buffer = new byte[1024];
            int bytesRead = 0;
            while ((bytesRead = is.read(buffer)) != -1) {
                os.write(buffer, 0, bytesRead);
                System.out.println("Read and written bytes " + bytesRead);
            }
        } catch (FileNotFoundException | IndexOutOfBoundsException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        copy("c:\\temp\\test1.txt", "c:\\temp\\test2.txt");
    }
}