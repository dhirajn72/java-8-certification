/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;

/**
 * @author Dhiraj
 * @date 29/08/18
 */
public class TestClass28 {
    public static void main(String[] args) {
        System.out.println(Arrays.asList("a","b","c","d","e").stream().reduce("X",(x,y)->x+y));
        //for (int i=0;i<50000;i++) {
        System.out.println(Arrays.asList("a", "b", "c", "d", "e").parallelStream().reduce("X", (x, y) -> x + y,(x,y)->x+y));
        //}
        // Xa Xb Xc Xd Xe    XaXbXcXdXe
        Arrays.asList('w','o','l','f').parallelStream().collect(ConcurrentSkipListSet::new, ConcurrentSkipListSet::add, ConcurrentSkipListSet::addAll).forEach(System.out::println);
        List<String> strings= Arrays.asList('w','o','l','f').stream()
                .collect(ArrayList::new,
                (list,item)->list.add(String.valueOf(item)),
                (l1,l2)->l1.addAll(l2));
        System.out.println(strings);




    }
}
