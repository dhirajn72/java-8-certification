/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter4;

import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

/**
 * @author Dhiraj
 * @date 27/07/18
 */
public class TestClass9 {
    public static void main(String[] args) {
        String[] arr=new String[]{"w","o","l","f"};

        BinaryOperator<String> binaryOperator=(x,y)->x+y;
        Stream<String> stream=Stream.of("w","o","l","f");
        /**
         * Below all are alternatives to do the same operation
         *
         */
        //String word2=stream.reduce("",(x,y)->x+y);
        //Optional<String> word2=stream.reduce((x, y)->x+y);
        //String word2=stream.reduce("",(x, y)->x.concat(y));
        //String word2=stream.reduce("",String::concat);
        //String word2=stream.reduce("",String::concat);
        //String word2=stream.reduce("",  binaryOperator);
        Optional<String> word2=stream.reduce(  binaryOperator);
        word2.ifPresent(System.out::println);


        /**
         *
         */
        //String word2=stream.reduce("",  binaryOperator,binaryOperator);
        //System.out.println(word2);
    }
}
