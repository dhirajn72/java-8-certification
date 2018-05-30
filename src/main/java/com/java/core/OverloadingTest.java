/*
 * All Rights Reserved @Dhiraj
 */

package com.java.core;

import java.io.IOException;

/**
 * @author Dhiraj
 * @date 20/05/18
 */
public class OverloadingTest {
    public static void main(String[] args) {
        Student1 s= new OldStudent1();
        //s.eat(1,5l);
        //s.eat(1,"dk");
    }
}

class Student1{
    public void eat(int a,String b){
        System.out.println("Student-eat");
    }
}


class OldStudent1 extends Student1{
    public void eat(int a,long b) throws IOException{
        System.out.println("Student-eat");
    }
}