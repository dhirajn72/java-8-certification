/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter1;

import org.apache.commons.lang3.builder.EqualsBuilder;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author Dhiraj
 * @date 21/07/18
 */
public class TestClass6 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Lion l1 = new Lion(1, "X", 200,AA.A);
        Lion l2 = new Lion(1, "X", 200,null);
        System.out.println(l1 == l2);
        System.out.println(l1.equals(l2));
        System.out.println((l1.hashCode() == l2.hashCode()) + "" + l1.hashCode() + " " + l2.hashCode());
        System.out.println(AA.valueOf("A"));
        System.out.println(AA.B.ordinal());
        System.out.println(AA.B.name());
        Path p = Paths.get("b.ser");
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(new File(p.toUri()))))) {
            objectOutputStream.writeObject(l1);
        }
        try (ObjectInputStream objectInputStream=new ObjectInputStream(new BufferedInputStream(new FileInputStream(new File(p.toUri()))))) {
            Object o =objectInputStream.readObject();
            if (o instanceof Lion)
                System.out.println((Lion)o);
        }
        //Serializing enum
        Path p1=Paths.get("p1.ser");
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(new File(p1.toUri())))) {
            objectOutputStream.writeObject(AA.class);
            System.out.println("enum serialized !!");
        }

        try (ObjectInputStream objectInputStream=new ObjectInputStream(new BufferedInputStream(new FileInputStream(new File(p1.toUri()))))) {
            Object o =objectInputStream.readObject();
            if (o instanceof AA)
                System.out.println((AA)o);
            System.out.println(o);
        }



    }
}


class Lion implements Serializable{
    private int id;
    private String name;
    private double weight;
    private AA a;

    public Lion(int id, String name, double weight,AA a) {
        this.id = id;
        this.name = name;
        this.weight = weight;
        this.a=a;
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

    public double getWeight() {
        return weight;
    }

    public AA getA() {
        return a;
    }

    public void setA(AA a) {
        this.a = a;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Lion{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                ", a=" + a +
                '}';
    }

    @Override
    public boolean equals(Object obj) {

        //1st way!!
        /*if (! (obj instanceof Lion))
            return false;
        Lion l1=(Lion)obj;
        return this.id==l1.id && this.name.equals(l1.getName()) && this.weight==l1.weight;
        */

        //2nd way!!
        if (!(obj instanceof Lion))
            return false;
        Lion l1=(Lion)obj;
        return  new EqualsBuilder().append(this.id,l1.getId())
                .append(this.name,l1.getName())
                .append(this.weight,l1.getWeight())
                .isEquals();

        //3rd way!!
        //return EqualsBuilder.reflectionEquals(this,obj);
    }

   /* @Override
    public int hashCode() {
        //return 10;
        return name.hashCode();
        //return super.hashCode();
    }*/
}



enum AA {
    A,B;
    {

    }
    static {

    }
}