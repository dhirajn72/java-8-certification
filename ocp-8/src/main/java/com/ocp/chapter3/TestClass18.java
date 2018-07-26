/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter3;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Dhiraj
 * @date 26/07/18
 */
public class TestClass18 implements Comparator<String>{
    public static void main(String[] args) {
        String[] strings={"123","Abb","aab"};
        Arrays.sort(strings,new TestClass18());
        for (String s:strings)
            System.out.print(s+" ");

        Comparable<String> comparable=(x)->89;
    }

    @Override
    public int compare(String o1, String o2) {
        return o2.toLowerCase().compareTo(o1.toLowerCase());
        //return o1.toLowerCase().compareTo(o2.toLowerCase());
    }
}

class A1{}
class B1 extends A1{}
class C1 extends B1{}


class D1<C1>{
    A1 a1= new A1();
    A1 a2= new B1();
    //A1 a3= new C1();

}

class D2<String> implements Inter{

   // String s1= new String("");
    @Override
    public void doIt(Object s) {

    }
}

interface Inter<String>{
    void doIt(String s);
}