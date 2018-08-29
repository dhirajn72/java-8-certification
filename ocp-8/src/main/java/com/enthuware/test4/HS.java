/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware.test4;

import java.util.HashSet;
import java.util.Iterator;

/**
 * @author Dhiraj
 * @date 25/08/18
 */

public class HS {
    public static void main(String args[]) {
        HashSet h=new HashSet();
        h.add("Mayank1");
        h.add("Mayank2");

        h.add("Vashist1");
        h.add("Dinesh");

        h.add("Vashist1");

        Iterator itr=h.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}