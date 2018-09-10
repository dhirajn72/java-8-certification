/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware.test3_a;

import java.io.*;

interface Book {
    public default String getId() {
        return "ISBN123456";
    }
}

interface Encyclopedia extends Book {
    public default String getId() {
        return "ISBN123456";
    }

    /*public static String getId() {
        return "ISBN123456";
    }*/

    //String getId();
}

/**
 * @author Dhiraj
 * @date 04/09/18
 */


class Boo implements Serializable {
    static int si = 20;
    transient int ti = 10;
}

public class TestClass26 {
    public static void main(String[] args) throws Exception {

        Boo boo = new Boo();
        boo.si++;
        System.out.println(boo.ti + " " + boo.si);
        FileOutputStream fos = new FileOutputStream("c:\\temp\\boo.ser");
        ObjectOutputStream os = new ObjectOutputStream(fos);
        os.writeObject(boo);
        os.close();

        FileInputStream fis = new FileInputStream("c:\\temp\\boo.ser");
        ObjectInputStream is = new ObjectInputStream(fis);
        boo = (Boo) is.readObject();
        is.close();
        System.out.println(boo.ti + " " + boo.si);
    }
}