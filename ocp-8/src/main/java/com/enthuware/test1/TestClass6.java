/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware.test1;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Dhiraj
 * @date 13/08/18
 */
public class TestClass6 {
    public static void main(String[] args) {
        List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17); //1
        Stream<Integer> primeStream = primes.stream(); //2

        Predicate<Integer> test1 = k->k<10; //3
        /*long count1 = primeStream.filter(test1).count();//4

        Predicate<Integer> test2 = k->k>10; //5
        long count2 = primeStream.filter(test2).count(); //6

        System.out.println(count1+" "+count2); //7*/

        //primeStream.collect(Collectors.partitioningBy(test1, Collectors.counting())).values().forEach(x-> System.out.println(x));
        Map map=primeStream.collect(Collectors.partitioningBy(test1, Collectors.counting()));
        System.out.println(map.values());


    }
}
