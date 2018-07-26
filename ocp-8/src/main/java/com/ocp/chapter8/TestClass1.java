/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter8;

import java.io.*;
import java.util.stream.Stream;

/**
 * @author Dhiraj
 * @date 16/07/18
 */
public class TestClass1 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        TestClass1 testClass=new TestClass1();
        testClass.serialize();
        testClass.deserialize();
    }
    public void serialize() throws IOException {
        try(ObjectOutputStream objectOutputStream=new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(new File("b.ser"))))) {
            B b= new B(99,"testA",88,"testB",new C());
            objectOutputStream.writeObject(b);
            System.out.println("Serialized !!");
            //System.out.write(String.valueOf(""));
            PrintWriter writer= new PrintWriter(new File(""));
            writer.write(String.valueOf(""));



        }
    }

    public  void deserialize() throws IOException, ClassNotFoundException {
        try(ObjectInputStream objectInputStream= new ObjectInputStream(new BufferedInputStream(new FileInputStream(new File("b.ser"))))) {
            System.out.println("******");
            Object ob=objectInputStream.readObject();
            if (ob instanceof B){
                B b1=(B)ob;
                System.out.println(b1);
                System.out.println(b1.getC());
            }
        }
    }

}
//class A implements Serializable{
    class A{
        int a;
        String b;

    public A() {
        System.out.println("DC-A");
    }

    public A(int a, String b) {
        System.out.println("A-arg");
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }
}
class  B extends A  implements Serializable{

    int d;
    String e;
    transient C c;


    public B() {
        System.out.println("DC-B");
    }

    public B(int a, String b, int d, String e, C c) {
        super(a, b);
        System.out.println("B-arg");
        this.d = d;
        this.e = e;
        this.c = c;
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }

    public String getE() {
        return e;
    }

    public void setE(String e) {
        this.e = e;
    }

    public C getC() {
        return c;
    }

    public void setC(C c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "B{" +
                "a=" + a +
                ", b='" + b + '\'' +
                ", d=" + d +
                ", e='" + e + '\'' +
                '}';
    }
}

class C {
    int x;
    String y;

    public C() {
        System.out.println("DC-C");
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public String getY() {
        return y;
    }

    public void setY(String y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "C{" +
                "x=" + x +
                ", y='" + y + '\'' +
                '}';
    }
}