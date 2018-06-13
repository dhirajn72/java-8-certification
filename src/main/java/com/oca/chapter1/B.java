/*
 * All Rights Reserved @Dhiraj
 */

package com.oca.chapter1;

/**
 * @author Dhiraj
 * @date 13/06/18
 */



class A{
    A() {  print();   }
    void print() { System.out.println("A"); }
}
class B extends A{
    int i =   4;
    public static void main(String[] args){
        A a = new B();
        a.print();
    }
    void print() { System.out.println(i); }
}
