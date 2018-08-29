/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware.test2;

import java.util.Arrays;
import java.util.List;

/**
 * @author Dhiraj
 * @date 28/08/18
 */
public class TestClass28 {
    public static void main(String[] args) {
        List<String> vals = Arrays.asList("a", "b","c","d");
        String join = vals.parallelStream().reduce("_", (a, b) -> a.concat(b));
        System.out.println(join);
    }
}
