/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter7;

import java.util.Arrays;

/**
 * @author Dhiraj
 * @date 03/08/18
 */
public class TestClass26 {
    public static void main(String[] args) {
        System.out.println(Arrays.asList(1,2,3,4,5,6,7,8,9).parallelStream().reduce(0,(a,b)-> {
            return (a-b);
        }));
        //System.out.println(Arrays.asList("w","o","l","f").parallelStream().reduce("X",String::concat));
        System.out.println(Arrays.asList("w","o","l","f").parallelStream().reduce("X",String::concat,String::concat));
    }
}
