/*
 * All Rights Reserved @Dhiraj
 */

package com.java.misc;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Dhiraj
 * @date 20/08/18
 */
public class TestClass13 {
    public static void main(String[] args) {

        Set<String> s= new HashSet<>();
        s.add("lion");
        s.add("tiger");
        s.add("bear");
        s.forEach(s1-> System.out.println(s1));
    }
}


class D<String>{

}