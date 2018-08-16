/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware.test1;

import java.util.function.Supplier;

/**
 * @author Dhiraj
 * @date 12/08/18
 */
public class TestClass1 {
    public static void main(String[] args) {
        MyFunction<Integer,String,Emp> empFunction= Emp::new;
        Supplier<Emp> empSupplier=Emp::new;
        System.out.println(empFunction.apply(200,"Dhiraj"));
    }
}

interface MyFunction<X,Y,Z>{
    Z apply(X x,Y y);
}

class Emp{
    int id;
    String name;


    public Emp() {
    }

    public Emp(int id, String name) {
        this.id = id;
        this.name=name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
