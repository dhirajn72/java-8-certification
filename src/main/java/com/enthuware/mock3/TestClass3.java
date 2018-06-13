/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware.mock3;

/**
 * @author Dhiraj
 * @date 10/06/18
 */



class TestClass3{
    void probe(Object x) { System.out.println("In Object"); } //3

    void probe(Number x) { System.out.println("In Number"); } //2

    void probe(Integer x) { System.out.println("In Integer"); } //2

    void probe(Long x) { System.out.println("In Long"); } //4
    void probe(Double x) { System.out.println("In Double"); } //4


    public static void main(String[] args){
        double a = 10;
        int b=new Integer(89);
        new TestClass3().probe(a);
        new TestClass3().probe(b);

    }
}
