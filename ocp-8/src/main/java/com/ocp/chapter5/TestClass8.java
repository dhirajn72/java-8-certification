/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter5;

import java.io.*;
import java.util.function.Consumer;

/**
 * @author Dhiraj
 * @date 10/07/18
 */
public class TestClass8 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Consumer consumer=System.out::println;
        Singleton singleton=Singleton.getInstance();
        consumer.accept(singleton);

        ObjectOutputStream objectOutputStream= new ObjectOutputStream(new FileOutputStream(new File("singleton.ser")));
        objectOutputStream.writeObject(singleton);
        objectOutputStream.close();
        consumer.accept("*****");
        ObjectInputStream objectInputStream= new ObjectInputStream(new FileInputStream(new File("singleton.ser")));
        Singleton singleton1=(Singleton) objectInputStream.readObject();
        consumer.accept(singleton1);
    }
}


class Singleton implements Serializable{
    private transient static volatile Singleton instance;

    private Singleton(){}
    public static Singleton getInstance(){
        if (instance==null){
            synchronized (Singleton.class){
                if (instance==null)
                    instance=new Singleton();
            }
        }
        return instance;
    }
    public Object readResolve() {
        return getInstance( );
    }
}