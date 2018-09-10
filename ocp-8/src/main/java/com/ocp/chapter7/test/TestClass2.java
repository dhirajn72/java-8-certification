/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter7.test;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

/**
 * @author Dhiraj
 * @date 30/08/18
 */
public class TestClass2 {
    public static void main(String[] args) {
        List<Integer> l1= Arrays.asList(1,2,3);
        List<Integer> l2=new CopyOnWriteArrayList<>(l1);
        Set<Integer> s3=new CopyOnWriteArraySet<>();
        s3.addAll(l2);
        for (Integer item:l2)
            l2.add(4);
        for (Integer item:s3)
            s3.add(5);
        System.out.println(l1.size()+":"+l2.size()+":"+s3.size());


        /*Iterator<Integer> iterator=l2.iterator();
        int count=0;
        while (iterator.hasNext()){
            l2.add(iterator.next());
            System.out.print(++count+" ");
        }*/

        Iterator<Integer> iterator1=s3.iterator();
        while (iterator1.hasNext()){
            s3.add(iterator1.next());
            //System.out.println(++count);
        }
        System.out.println(s3);
        System.out.println(l2);
    }
}
