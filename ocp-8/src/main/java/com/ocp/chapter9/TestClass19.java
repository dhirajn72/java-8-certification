/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter9;

import java.util.*;

/**
 * @author Dhiraj
 * @date 22/09/18
 */
public class TestClass19 {
    public static void main(String[] args) {
        String[] sa = { "charlie", "bob", "andy", "dave" };
        Collections.sort(Arrays.asList(sa), null);
        System.out.println(sa[0]);
        Collections.sort(Arrays.asList(sa), Comparator.reverseOrder());
        System.out.println(sa[0]);
        Collections.sort(Arrays.asList(sa), Comparator.comparing(x->x));
        System.out.println(sa[0]);
        Collections.sort(Arrays.asList(sa), (x,y)->y.compareTo(x));
        System.out.println(sa[0]);

        List<String> list= new ArrayList<>();
        System.out.println(list.add("test"));
        System.out.println(list.add("test1"));
        System.out.println(list);

    }
}
