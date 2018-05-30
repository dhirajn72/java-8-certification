/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Dhiraj
 * @date 20/05/18
 */


public class ListTest{
    public static void main(String args[]){
        List s1 = new ArrayList( );
        s1.add("a");
        s1.add("b");
        s1.add(1, "c");
        List s2 = new ArrayList(  s1.subList(1, 1) );
        //List s2 = new ArrayList(  s1.subList(1, 2) );
        s1.addAll(s2);
        System.out.println(s1);
    }
}