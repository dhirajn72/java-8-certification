/*
 * All Rights Reserved @Dhiraj
 */

package com.java.core;

/**
 * @author Dhiraj
 * @date 25/05/18
 */
public class EncapsulationTest {
    public static void main(String[] args) {
        Clone c1= new Clone(99,new StringBuilder("dhiraj"));
        Clone c2=c1.changeObject();
        System.out.println(c1==c2);
        System.out.println(c1.getName()==c2.getName());


    }

}



class Clone{
    private int id;
    private StringBuilder name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public StringBuilder getName() {
        return name;
    }

    public void setName(StringBuilder name) {
        this.name = name;
    }

    public Clone(int id, StringBuilder name) {
        this.id = id;
        this.name = new StringBuilder(name);
    }

    public Clone changeObject(){
        return new Clone(this.id,new StringBuilder(this.name.toString()));
    }



}