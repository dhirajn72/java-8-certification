/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter4;

import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * @author Dhiraj
 * @date 07/07/18
 */
public class TestClass1 {
    public static void main(String[] args) {

        BiPredicate<String,String> stringBiPredicate=String::contentEquals;
        System.out.println(stringBiPredicate.test("test","test"));
        Predicate<String> stringPredicate= s->s.contains("c");
        System.out.println(stringPredicate.test("z"));

        Predicate<String> stringPredicate1=stringPredicate.and(stringPredicate);
        System.out.println(stringPredicate1.test("hg"));

        TriFunction<String,String,String,String> triFunction=(o1, o2, o3) -> {return o1.concat(o2).concat(o3);};
        System.out.println(triFunction.test("a","b","c"));

        Supplier<Boolean> booleanSupplier=() -> {return true;};
        Supplier<String> stringSupplier=() -> {return new String("xyz");};

        System.out.println(booleanSupplier.get());
        System.out.println(stringSupplier.get());;

    }
}

//@FunctionalInterface
interface TriFunction<T,U,V,R>{
    R test(T t,U u,V v);
    default void m1(){};
    //void m2();
}