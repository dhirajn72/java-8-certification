/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter1;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author Dhiraj
 * @date 21/07/18
 */
public class TestClass7 {
    public static void main(String[] args) throws IOException,ClassNotFoundException{

        Lion l1= new Lion(1, "X", 200,AA.A);
        System.out.println(l1.hashCode());
        Path p1= Paths.get("p1");
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(new File(p1.toUri()))))) {
            objectOutputStream.writeObject(l1);
            System.out.println(l1);
        }
        try (ObjectInputStream objectInputStream=new ObjectInputStream(new BufferedInputStream(new FileInputStream(new File(p1.toUri()))))) {
            Object o =objectInputStream.readObject();
            if (o instanceof Lion) {
                Lion l=(Lion) o;
                System.out.println(l.hashCode());
                System.out.println(l);
                System.out.println(l1.equals(l));
            }
        }

        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(new File(p1.toUri()))))) {
            objectOutputStream.writeObject(AA.A);
            System.out.println(AA.A.hashCode());
            System.out.println("enum serialized");
        }
        try (ObjectInputStream objectInputStream=new ObjectInputStream(new BufferedInputStream(new FileInputStream(new File(p1.toUri()))))) {
            Object o =objectInputStream.readObject();
            if (o instanceof AA) {
                AA l=(AA) o;
                System.out.println(l.hashCode());
                System.out.println(l);
                //System.out.println(l1.equals(l));
            }
        }





    }
}
