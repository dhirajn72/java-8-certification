/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware.test;

import java.util.*;

/**
 * @author Dhiraj
 * @date 11/08/18
 */
public class TestClass9 {
    public static void main(String[] args) {

        int i=0;
        // maintains order
        List<String> list= new ArrayList<>();
        //List<String> list= new LinkedList<>();
        //List<String> list= new Stack<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        for (String x:list);
            //System.out.println(x);

        HashSet<Integer> set= new HashSet<>();
        //LinkedHashSet<String> set= new LinkedHashSet<>();
        while (i<100){
            set.add(i);
            i++;
        }
        Iterator<Integer> iterator=set.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());
    }
}
