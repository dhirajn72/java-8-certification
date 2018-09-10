/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware.test3_a;

import java.util.TreeSet;

/**
 * @author Dhiraj
 * @date 02/09/18
 */


public class TestClass14 {
    public static void main(String[] args) {
        TreeSet<Integer> s = new TreeSet<Integer>();
        TreeSet<Integer> subs = new TreeSet<Integer>();
        for (int i = 324; i <= 328; i++) {
            s.add(i);
        }
        subs = (TreeSet) s.subSet(326, true, 328, true);
        // subs.add(329);
        //subs.add(325);

        System.out.println(s + " " + subs);
    }
}