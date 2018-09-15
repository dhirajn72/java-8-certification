/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware.test2;

import java.io.*;

/**
 * @author Dhiraj
 * @date 15/08/18
 */
public class TestClass2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(new File("emp.ser")));
            ObjectInputStream ois =  new ObjectInputStream(new FileInputStream(new File("emp.ser")));

        ) {
            Employee employee= new Employee(99,"singh",10);
            oos.writeObject(employee);
            //oos.close();
            System.out.println("Serialized !");
            System.out.println("Deserializing !");
            Object o=ois.readObject();
            if (o instanceof Employee) {
                Employee e = (Employee) o;
                System.out.println(e);
            }
            //ois.close();

        }

    }
}
