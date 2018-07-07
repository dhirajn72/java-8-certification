/*
 * All Rights Reserved @Dhiraj
 */

package com.java.test;

/**
 * @author Dhiraj
 * @date 24/06/18
 */
public interface TestClass1 {
    public static void main(String[] args) {
        I1 i1= new SubJect();
        i1.move();
        I2 i2=(I2)i1; //or (SubJect)i1;
        i2.doStuff();
    }
}
class SubJect implements I1,I2{

    public void move(){
        System.out.println("move()");
    }
    public void doStuff(){
        System.out.println("doStuff()");
    }
}

interface I1{
    void move();
}
interface  I2{
    void doStuff();
}