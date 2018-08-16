/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware.test;

import java.util.Arrays;

/**
 * @author Dhiraj
 * @date 11/08/18
 */

public class TestClass10
{
    static String[] sa = { "a", "aa", "aaa", "aaaa" };
    static
    {
        Arrays.sort(sa);
    }
    public static void main(String[] args)
    {
        String search = "";
        if(args.length != 0) search = args[0];
        System.out.println(Arrays.binarySearch(sa, search));
        //System.out.println(Arrays.toString(sa));
    }
}