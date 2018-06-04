/*
 * All Rights Reserved @Dhiraj
 */

package com.java.core.org;

/**
 * @author Dhiraj
 * @date 02/06/18
 */
public class ClassLoadingTest {
    public static void main(String[] args) {
        new D();
        /*System.out.println("SIB-A");
        System.out.println("SIB-B");
        System.out.println("SIB-C");
        System.out.println("SIB-D");

        System.out.println("IIB-A");
        System.out.println("DC-A()");

        System.out.println("IIB-B");
        System.out.println("DC-B()");

        System.out.println("IIB-C");
        System.out.println("DC-C()");

        System.out.println("IIB-D");
        System.out.println("DC-D()");*/

        System.out.println(Inter3.Test.x);
        int b = 0B101010;
        System.out.println(b);
        long l = 0Xfacel;
        int x = 0Xface;
        System.out.println(l);
        float f = Float.valueOf("123.32F");
        System.out.println(f);
        byte b1 = (byte) 132;
        System.out.println(b1);
    }

    void doStuff() {
        class Test {
            final int x = 0;
        }
    }


    /*void go(int ouch) {
        ouch++;
        for (int ouch = 3; ouch < 6; ouch++)
            ;
        System.out.print(" " + ouch);
    }*/
}


class A {
    static {
        System.out.println("SIB-A");
    }

    {
        System.out.println("IIB-A");

    }

    A() {
        System.out.println("DC-A()");
    }
}

class B extends A {
    static {
        System.out.println("SIB-B");
    }

    {
        System.out.println("IIB-B");
    }

    B() {
        System.out.println("DC-B()");
    }
}

class C extends B {
    static {
        System.out.println("SIB-C");
    }

    {
        System.out.println("IIB-C");
    }

    C() {
        System.out.println("DC-C()");
    }
}

class D extends C {
    static {
        System.out.println("SIB-D");
    }
    {
        System.out.println("IIB-D");

    }
    D() {
        System.out.println("DC-D()");
    }
}


interface  Inter3{
    abstract class Test{
        public static int x=99;
        abstract public void  m1();
    }
   public default  void m1(){

    }
    public static   void m2(){

    }
}

