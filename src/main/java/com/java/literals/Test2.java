/*
 * All Rights Reserved @Dhiraj
 */

package com.java.literals;

/**
 * @author Dhiraj
 * @date 05/06/18
 */
public class Test2 {
    public static void main(String[] args) {
        final short s=90;
        //char c=s;//Invalid
        char c=(char)s;
        byte b=s;
        System.out.println((c==s) +" "+ (b==s));

    }
}

class Loop {
    Loop(int x){
    }
}
class Loop1 extends Loop{
    Loop1(){
        this(3);
    }
    Loop1(int x){
        super(x);
    }
}