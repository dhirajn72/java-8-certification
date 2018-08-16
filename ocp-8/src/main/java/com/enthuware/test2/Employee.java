/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware.test2;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * @author Dhiraj
 * @date 15/08/18
 */
public class Employee implements Serializable {
    private int id;
    private  String name;

    public Employee(int id, String name) {
        System.out.println("cons-called");
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    /*private void writeObject(ObjectOutputStream out) throws IOException{
        out.writeInt(this.getId());
        out.writeUTF(this.getName());
        System.out.println("writeObject(ObjectOutputStream out)");

    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException{

        String name=in.readUTF();
        int id=in.readInt();
        System.out.println("readObject(ObjectInputStream in)");
        System.out.println(name+"::"+id);
    }*/
}
