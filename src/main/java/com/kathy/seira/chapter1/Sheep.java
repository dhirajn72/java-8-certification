/*
 * All Rights Reserved @Dhiraj
 */

package com.kathy.seira.chapter1;

import java.util.function.Predicate;

/**
 * @author Dhiraj
 * @date 16/06/18
 */

public class Sheep {
    public static void main(String[] args) {
        Sheep s = new Sheep();
        //s.go(() -> adder(5, 1) < 7);    // line A
        //s.go(x -> { adder(6, 2) < 9;});     // line B
        //s.go(x, y -> adder(3, 2) < 4);  // line C
        s.go(x -> {
                    return adder(6, 2) < 9;});

        int _h=90;
        int[] arr=new int[4];
        System.out.println(arr instanceof Object);
    }
    void go(Predicate<Sheep> e) {
        Sheep s2 = new Sheep();
        if(e.test(s2))
            System.out.print("true ");
        else
            System.out.print("false ");
    }
    static int adder(int x, int y) {
        return x + y;
    } }