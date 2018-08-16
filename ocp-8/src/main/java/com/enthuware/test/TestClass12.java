/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware.test;

import java.util.TreeSet;

/**
 * @author Dhiraj
 * @date 12/08/18
 */

public class TestClass12 {

    public static void main(String[] args) {

        TreeSet<Integer> s = new TreeSet<Integer>();
        TreeSet<Integer> subs = new TreeSet<Integer>();

        for (int i = 324; i <= 328; i++) {
            s.add(i);
        }
        subs = (TreeSet) s.subSet(326, true, 328, true);
        subs.add(329);
        System.out.println(s + " " + subs);

    }

}