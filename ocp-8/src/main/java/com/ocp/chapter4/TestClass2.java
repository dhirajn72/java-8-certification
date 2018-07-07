/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter4;

import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * @author Dhiraj
 * @date 08/07/18
 */
public class TestClass2 {
    public static void main(String[] args) {
        Supplier<TestClass2> supplier= TestClass2::new;
        Consumer<Integer> consumer=System.out::println;
        TestClass2 test1 = supplier.get();
        TestClass2 test2 = supplier.get();
        System.out.println(test1.hashCode() +" "+ test2.hashCode());
        consumer.accept(test1.doSum(new int[]{3,4,5}));

        System.out.println(supplier.get().sum(new int[]{3,4,5}));

    }
    int doSum(int... arr){
        int sum=0;
        for (int x:arr)
            sum+=x;
        return sum;
    }
    Optional<Integer> sum(int... arr){
        int sum=0;
        for (int x:arr)
            sum+=x;
        //return Optional.empty();
        return Optional.of(4);
    }
}
