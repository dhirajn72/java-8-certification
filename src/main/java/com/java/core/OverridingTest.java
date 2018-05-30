/*
 * All Rights Reserved @Dhiraj
 */

package com.java.core;

/**
 * @author Dhiraj
 * @date 20/05/18
 */
public class OverridingTest {
    public static void main(String[] args) throws Exception {
        Student s= new OldStudent();
        s.eat();

    }
}


class Student{
    public void eat() throws  Exception{
        System.out.println("Student-eat");
    }
}

class OldStudent extends Student{

    @Override
    public void eat()  {
        System.out.println("OldStudent-eat");
    }
}

