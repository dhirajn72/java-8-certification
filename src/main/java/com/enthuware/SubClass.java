/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware;

/**
 * @author Dhiraj
 * @date 30/05/18
 */
public class SubClass extends SuperClass {
    int i, j, k;

    public SubClass(int m, int n) {
        i = m;
        j = m;
        System.out.println("SubClass(int m, int n)");
    } //1

    public SubClass(int m) {
        super(m);
        System.out.println("SubClass(int m)");
    } //2


    public static void main(String[] args) {
        SubClass subClasss= new SubClass(2,2);
    }

}


class SuperClass {

    public SuperClass(int m) {
        System.out.println("SuperClass(int m)");
    }

    public SuperClass() {
        System.out.println("SuperClass()");
    }
}