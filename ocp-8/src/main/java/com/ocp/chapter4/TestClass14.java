/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter4;

import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author Dhiraj
 * @date 28/07/18
 */
public class TestClass14 {
    public static void main(String[] args) {

        Stream<Integer>  stream= Stream.iterate(1,x->x+1);
        //stream.limit(10).forEach(System.out::println);
        //System.out.println(stream.limit(5).reduce(0,(x,y)->x+y));
        System.out.println(stream.limit(5).mapToInt(x->x).sum());

        //IntStream stream1= IntStream.iterate(0,x->x+1);
        IntStream stream1= IntStream.of(0,1,2,3,4);

        OptionalDouble average=stream1.limit(5).average();  //OptionalDouble is for premitives
        System.out.println(average.getAsDouble());

        Stream<Integer> integerStream1=Stream.empty();
        Stream<Integer> integerStream2=Stream.generate(()->7);
        //System.out.println(integerStream2.count());;
        System.out.println("done");

        IntStream stream2= IntStream.iterate(0,x->x+1).limit(5);
//        stream2.forEach(System.out::println);
        IntStream stream3= IntStream.range(0,5); //5 won't be included,
  //      stream3.forEach(System.out::println);
        IntStream stream4= IntStream.rangeClosed(0,5); //5 will be included,
        stream4.forEach(System.out::println);

        System.out.println("&&&&&");
        Stream<Integer> stream5= Stream.of(0,1,2,3,4);
        IntStream intStream=stream5.mapToInt(x->x);
        intStream.forEach(x-> System.out.println(x));
    }
}
