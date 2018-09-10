/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter6;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

/**
 * @author Dhiraj
 * @date 30/08/18
 */
public class TestClass11 {
    public static void main(String[] args) {

        System.out.println(TimeUnit.MILLISECONDS.toNanos(1));
        System.out.println(TimeUnit.SECONDS.toMillis(1));
        System.out.println(TimeUnit.HOURS.toSeconds(1));
        int[] arr= new int[]{1,2,3,4,5,6};
        //System.out.println(Arrays.stream(arr).boxed().collect(Collectors.toList()));
        int sum=0;
        for (int i:arr)
            sum+=i;
        System.out.println(sum);
        System.out.println(Arrays.stream(arr).sum());
    }
}
