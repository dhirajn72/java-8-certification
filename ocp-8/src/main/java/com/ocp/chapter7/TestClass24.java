/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter7;

import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;

/**
 * @author Dhiraj
 * @date 03/08/18
 */
public class TestClass24 {
    public static void main(String[] args) {
        Set<String> strings=new ConcurrentSkipListSet<>();
        strings.add("z");
        strings.add("a");
        strings.add("w");
        strings.add("x");
        System.out.println(strings);

    }
}
