/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter2;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author Dhiraj
 * @date 22/07/18
 */
public class TestClass3 {
    public static void main(String[] args)throws IOException,ClassNotFoundException {
        Path p= Paths.get("singleton.ser");
        Singleton s= Singleton.getInstance();
        System.out.println(s.hashCode());
        try(ObjectOutputStream objectOutputStream= new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(new File(p.toUri()))))) {
            objectOutputStream.writeObject(s);
            System.out.println("Serialized !!");
        }
        try(ObjectInputStream objectInputStream= new ObjectInputStream(new BufferedInputStream(new FileInputStream(new File(p.toUri()))))) {
            Object ob=objectInputStream.readObject();
            if (ob instanceof Singleton){
                Singleton s1=(Singleton)ob;
                System.out.println("desirialized");
                System.out.println(s1.hashCode());
            }
        }
    }
}

class Singleton implements Serializable{

    private static volatile Singleton instance=null;
    private Singleton(){}
    public static Singleton getInstance(){
        if (instance==null){
            synchronized (Singleton.class){
                if (instance==null){
                    instance=new Singleton();
                }
            }
        }
        return instance;
    }

    private Object readResolve(){
        return getInstance();
    }
}