/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter1;

/**
 * @author Dhiraj
 * @date 03/07/18
 */
public class VertulMethodTest {
    public static void main(String[] args) {
        SuperClass1 ob= new SubClass1();
        ob.callM1();
        System.out.println(ob instanceof Runnable);

    }
}
class SuperClass1{
    void m1(){
        System.out.println("SuperClass1-m1()");
    }
    void callM1(){
        m1();
    }
}
class SubClass1 extends SuperClass1{

    @Override
    void m1(){
        System.out.println("SubClass1-m1()");
    }
}
