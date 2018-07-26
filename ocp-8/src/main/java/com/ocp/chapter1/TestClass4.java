/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter1;
import java.util.List;
import java.util.ArrayList;
import static java.util.Collections.sort;


/**
 * @author Dhiraj
 * @date 21/07/18
 */
public class TestClass4 {
    public List<String> copyAndSort(List<String> original){
        List<String> strings=new ArrayList<>();
        sort(strings);
        return strings;
    }

    public static void main(String[] args) {
        A4Outer.m1();

        //AbstractClass abstractClass=()->{};
        AbstractClass abstractClass=new AbstractClass() {
            @Override
            public void m1() {
                //implementation goes here !
            }
        };
        abstractClass.m1();
        System.out.println(new A4Outer.A4Inner().x);
    }
}

class A4Outer{

    static class A4Inner{
        public static  int x;

    }

    public static void m1(){
        int x=90;
        class A4Inner{
             int x=100;
             public void m1(){
                 System.out.println(this.x);
                 System.out.println(x);

             }

            public A4Inner(){
                System.out.println("DC-A4Inner");
                //y=0;
            }public A4Inner(int x){
                System.out.println("DC-A4Inner(int x)");
            }
        }
        new A4Inner().m1();
    }
}

abstract class AbstractClass{
    public abstract void m1();
}