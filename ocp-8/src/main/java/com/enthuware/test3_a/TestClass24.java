/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware.test3_a;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * @author Dhiraj
 * @date 04/09/18
 */
public class TestClass24 {
    static String args;
    public static void main(String[] args) {
        ResourceBundle rb= ResourceBundle.getBundle("zoo_fr_CA",new Locale("en","US"));
        System.out.println(rb);
        //String[] values=rb.getStringArray("a");

        InnerTest innerTest= new InnerTest(90){
            @Override
            public void m1() {
                System.out.println(this.x);;
            }
        };
        innerTest.m1();
        Locale locale=Locale.US;
        int value=0;
        assert value==10:null;
    }
    class Inner{
        //static int x=0; // Not allowed
        final static int x=0;
    }
}
class InnerTest{
    int x;
    public InnerTest(int x){this.x=x;}
    public void m1(){
        System.out.println("m1()");
        System.out.println(this.x);
    }
}