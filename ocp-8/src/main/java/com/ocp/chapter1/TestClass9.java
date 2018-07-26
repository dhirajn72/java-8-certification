/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter1;

/**
 * @author Dhiraj
 * @date 22/07/18
 */
public class TestClass9 {
    public static void main(String[] args) {
        SuperClass obj= new SubClass();
        obj.doIt();
    }
}

class SuperClass{
    public void doIt(){
        m1();
    }
    public void m1(){
        System.out.println("m1-super");
    }
}
class SubClass extends SuperClass{
    @Override
    public void m1() {
        System.out.println("m1-sub");
    }
}