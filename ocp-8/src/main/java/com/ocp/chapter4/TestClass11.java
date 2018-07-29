/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter4;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Dhiraj
 * @date 28/07/18
 */
public class TestClass11 {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("monkey","gorilla","bonobo","man","bonobo","bonobo");
        //StringBuilder res=stream.filter((x)->x.startsWith("m")).collect(StringBuilder::new,(StringBuilder x,String y)->x.append(y),(StringBuilder x,StringBuilder y)->x.append(y));
        //StringBuilder res=stream.filter((x)->x.startsWith("m")).collect(StringBuilder::new,StringBuilder::append,StringBuilder::append);
        //System.out.println(res);
        //OR
        //stream.filter((x)->!x.startsWith("m")).forEach(System.out::println);
        //stream.distinct().forEach(System.out::println);
        stream.distinct().filter(x->x.startsWith("m")).collect(Collectors.toList()).forEach(System.out::println);
    }
}
