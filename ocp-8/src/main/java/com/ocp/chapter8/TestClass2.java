/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter8;

import java.io.File;
import java.util.Enumeration;
import java.util.Properties;
import java.util.function.Consumer;

/**
 * @author Dhiraj
 * @date 16/07/18
 */
public class TestClass2 {
    public static void main(String[] args) {
        Consumer consumer= System.out::println;
        consumer.accept(File.separator);
        consumer.accept(System.getProperty("file.separator"));
        consumer.accept(System.getProperties());
        Properties p= System.getProperties();
        Enumeration<?> keys=p.propertyNames();
        //while (keys.hasMoreElements())
        //    consumer.accept(keys.nextElement());
        consumer.accept(System.getProperty("user.name"));

        //File file=new File("/Users/300012951/work"); //Absolute path
        File file=new File("ocp-8"); //Relative path
        consumer.accept(file.exists());

    }
}
