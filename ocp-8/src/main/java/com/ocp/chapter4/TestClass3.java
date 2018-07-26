/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter4;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * @author Dhiraj
 * @date 26/07/18
 */
public class TestClass3 {
    public static void main(String[] args) {
        Map<Integer,Integer> map= new HashMap<>();
        System.out.println(map.put(1,67));
        System.out.println(map.put(3,90));
        BiConsumer<Integer,Integer> biConsumer=(k,v)->{map.put(k,v);};
        biConsumer.accept(2,66);
        map.forEach((k,v)-> System.out.println(k+":"+v));

        Predicate<String> predicate1= (s)->s.contains("eggs");
        Predicate<String> predicate2= (s)->s.contains("brown");

        Predicate<String> predicate3= (s)->s.contains("eggs") && s.contains("brown");
        Predicate<String> predicate4= predicate1.and(predicate2);
        Predicate<String> predicate5= predicate1.and(predicate2.negate());

        System.out.println(predicate4.test("eggsbrown"));
        System.out.println(predicate5.test("eggsbrown"));

        System.out.println("*****");
        Function<String,Boolean> stringBooleanFunction1= (s)->s.contains("x");
        Function<String,Boolean> stringBooleanFunction2= (s)->false;
        Predicate<String> stringPredicate=(s)->false;
        Function<String,Integer> stringIntegerFunction= (s)->s.length();
        Function<String,Integer> stringIntegerFunction1= String::length;



        System.out.println(stringBooleanFunction1.apply("menx"));
        System.out.println(stringBooleanFunction2.apply("menx"));
        System.out.println(stringPredicate.test("menx"));
        System.out.println(stringIntegerFunction.apply("menx"));
        System.out.println(stringIntegerFunction1.apply("menx"));

        /**
         * Example of Custom prediate, which takes three parameters
         */
        EmpTestPredicate<String,String,String> empTestPredicate=(a,b,c)->{
            System.out.println(a);
            System.out.println(b);
            System.out.println(a.hashCode());
            System.out.println(b.hashCode());
            System.out.println(c.hashCode());
            return a.length()>b.length()?true:(a.length()>c.length()?true:false);
        };
        System.out.println(empTestPredicate.test("x","y","z"));



    }
}

/**
 *
 * This is custom predicate functional interface, which takes 3 parameters.
 * (This way we can write our own interfaces, depending on our requirements)
 * @param <T>
 * @param <U>
 * @param <V>
 */

@FunctionalInterface
interface EmpTestPredicate<T,U,V>{
    boolean test(T t,U u,V v);
}