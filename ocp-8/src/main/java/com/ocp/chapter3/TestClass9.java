/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter3;

import java.util.Map;
import java.util.Objects;

/**
 * @author Dhiraj
 * @date 24/07/18
 */
public class TestClass9 {
    public static void main(String[] args) {
        Person p= new Person(new String("test"),new Integer(1));
        System.out.println(p.getId());
        System.out.println(p.getName());
        if (p.getName() instanceof Map){
            System.out.println("yeah!!");
        }
    }
}

class Person<T,N>{
    /**
     *
     * This is limitation of generics, properties can't be declared as static
     */
    /*private static T id;
    private static N name;
    */
    private  T id;
    private  N name;

    public Person() {
    }

    public Person(T id, N name) {
        this.id = id;
        this.name = name;
    }

    public  T getId() {
        return id;
    }

    public  void setId(T id) {
        this.id = id;
    }

    public  N getName() {
        return name;
    }

    public  void setName(N name) {
        this.name = name;
    }
}