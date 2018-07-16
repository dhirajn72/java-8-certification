/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter7;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author Dhiraj
 * @date 14/07/18
 */
public class TestClass4 {
    public static void main(String[] args) {
        List<Integer> list=new CopyOnWriteArrayList<>();
        list.add(12);
        List<Integer> list1=list;
        System.out.println(list==list1);
        list.add(23);
        list.remove(0);
        System.out.println(list==list1);
        System.out.println(list+" "+list1);
        System.out.println("**********");
        List<Integer> list2=new CopyOnWriteArrayList<>(Arrays.asList(16,78,43,24));
        for (int x:list2){
            System.out.println(x);
            list2.add(66);
        }
        System.out.println("**");
        System.out.println(list2);
        System.out.println(list2.size());


    }
}
