/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter6;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author Dhiraj
 * @date 30/08/18
 */
public class TestSingleton {
    public static void main(String[] args) throws IOException, ClassNotFoundException, CloneNotSupportedException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        try(ObjectOutputStream objectOutputStream= new ObjectOutputStream(new FileOutputStream(new File("singleton.ser")));
            ObjectInputStream objectInputStream= new ObjectInputStream(new FileInputStream(new File("singleton.ser")))) {


            Singleton s=Singleton.getInstance();
            /*objectOutputStream.writeObject(s);
            System.out.println(s);
            System.out.println("Singleton serialized !!");
            Object o=objectInputStream.readObject();
            if (o instanceof Singleton){
                Singleton s2=(Singleton)o;
                System.out.println(s2);
            }
            Singleton cloned=(Singleton) s.clone();
            System.out.println(s);
            System.out.println(cloned);

            System.out.println("*****");*/
            System.out.println(s);

            Class c=Singleton.class;
            Constructor[] cons=c.getDeclaredConstructors();
            cons[0].setAccessible(true);
            Singleton sss = (Singleton) cons[0].newInstance();
            System.out.println(sss);



        }
    }
}
