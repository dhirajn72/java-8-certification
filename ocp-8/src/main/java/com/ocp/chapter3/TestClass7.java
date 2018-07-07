/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter3;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Dhiraj
 * @date 07/07/18
 */
public class TestClass7 {
    public static void main(String[] args) {
        //doIt("test");
        System.out.println(doIt("test"));
        TestClass7.<Integer>doIt(7);

        List<Integer> list= new ArrayList<>();
        list.add(2);
        list.add(7);
        list.add(6);
        list.forEach((s)-> System.out.println(s));
        list.forEach(s-> System.out.println(s));
        list.forEach(System.out::println);
    }

    public static <T> T doIt(T t){

        System.out.println(t);
        return t;
    }
}

class A{

}