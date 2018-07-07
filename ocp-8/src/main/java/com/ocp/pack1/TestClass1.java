/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.pack1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Dhiraj
 * @date 03/07/18
 */
public class TestClass1 {
    public static void main(String[] args) {
        List<? extends Parent1> p=new ArrayList<>();
        List<Child1> child1s= new ArrayList<>();
        List<Parent1> parent1s= new ArrayList<>();

        child1s.add(new Child1());
        parent1s.add(new Parent1());
        p=child1s;
        p=parent1s;
    }
}

class Parent1{

}

class Child1 extends Parent1{

}
