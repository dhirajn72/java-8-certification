/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter7;

import java.util.Arrays;

/**
 * @author Dhiraj
 * @date 17/09/18
 */
public class TestClass34 {
    public static void main(String[] args) {
        /*Arrays.asList("apple","ball","cat","dog","elephant","fish").stream().findAny().ifPresent(System.out::println);
        Arrays.asList("apple","ball","cat","dog","elephant","fish").parallelStream().findAny().ifPresent(System.out::println);
        Arrays.asList("apple","ball","cat","dog","elephant","fish").stream().findFirst().ifPresent(System.out::println);
        Arrays.asList("apple","ball","cat","dog","elephant","fish").parallelStream().findFirst().ifPresent(System.out::println);

        System.out.println("*****");

        Arrays.asList("apple","ball","cat","dog","elephant","fish").stream().unordered().skip(2).parallel().forEach(System.out::println);
*/
        System.out.println(Arrays.asList("apple","ball","cat","dog","elephant","fish").parallelStream().reduce("X",String::concat));
        System.out.println(Arrays.asList("apple","ball","cat","dog","elephant","fish").parallelStream().reduce("X",String::concat,String::concat));




    }
}
