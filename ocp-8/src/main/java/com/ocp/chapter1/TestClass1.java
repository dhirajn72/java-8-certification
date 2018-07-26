/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter1;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * @author Dhiraj
 * @date 02/07/18
 */
public class TestClass1 {
    private int id;
    private String name;

    public TestClass1(int id,String name){
        this.id=id;
        this.name=name;
    }

    public static void main(String[] args) {
        TestClass1 t1= new TestClass1(11,"dk");
        System.out.println(t1);
        TestClass1 t2= t1;//new TestClass1(11,"dk");
        System.out.println(t2);
        System.out.println(t1.equals(t2));



    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public boolean equals(Object obj) {
        return EqualsBuilder.reflectionEquals(this,obj);
    }
}


abstract class T{
    static void clean(){

    }
}
 class SubT extends T{
   // @Override // This is not overriding, because if you uncomment this annotation, compilation fails
    static void clean() {
    }
}
