/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware.test4;

import java.util.TreeSet;
import java.util.function.BiConsumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Dhiraj
 * @date 27/08/18
 */
public class TestClass11 {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("apple", "ball", "cat", "dog","cat");
        // stream.reduce((x,y)->x.concat(y)).ifPresent(System.out::println);
        /*tring res = stream.reduce("test", (x, y) -> x.concat(y));
        System.out.println(res);*/

        /*String res= stream.reduce("test",(x,y)->x.concat(y),(x,y)->x.concat(y));
        System.out.println(res);*/
        //stream.collect(TreeSet::new,TreeSet::add,TreeSet::addAll).stream().forEach(System.out::println);

        Supplier<TreeSet> treeSetSupplier=()->new TreeSet();
        BiConsumer<TreeSet,String> treeSetConsumer=(x,y)->x.add(y);
        BiConsumer<TreeSet,TreeSet> treeSetConsumer1=(x,y)->x.addAll(y);
        //stream.collect(treeSetSupplier,treeSetConsumer,treeSetConsumer1).stream().forEach(System.out::println);

        /*List<String> list= stream.collect(Collectors.toList());
        System.out.println(list);*/
        //System.out.println(stream.toArray());

        /**
         *
         *  Function<? super T, ? extends K> keyMapper,
            Function<? super T, ? extends U> valueMapper,
            BinaryOperator<U> mergeFunction
         */
        //Map<Integer,String> listMap =stream.collect(Collectors.toMap(String::length,k->k,(x,y)->x+":"+y, TreeMap::new));
        //Map<Integer,String> listMap =stream.collect(Collectors.toMap(String::length,k->k,(x,y)->x+":"+y));

        //System.out.println(listMap);
        //System.out.println(listMap instanceof TreeMap);


        //List<Integer> integers=stream.collect(Collectors.mapping((x->x.length()),Collectors.toList()));
        //HashSet<Integer> integers=stream.collect(Collectors.mapping((x->x.length()),Collectors.toSet()));

        //System.out.println(integers);

        /*Map<Integer,List<String>> listMap=stream.collect(Collectors.groupingBy(x->x.length(),Collectors.toList()));
        System.out.println(listMap);*/

        /*Map<Integer,List<String>> listMap= stream.collect(Collectors.groupingBy(String::length));
        System.out.println(listMap);*/

        /*Map<Boolean,List<String>> booleanListMap=stream.collect(Collectors.partitioningBy(x->x.length()>3));
        System.out.println(booleanListMap);*/

        /*Map<Boolean,List<String>> booleanListMap=stream.collect(Collectors.partitioningBy(x->x.length()>3));
        System.out.println(booleanListMap);*/

        /*Map<String, Integer> result = Stream.of("java", ".net", "python").collect(Collectors.toMap(String::toUpperCase, String::length));
        System.out.println(result);*/

        /*Map<String, Integer> result = Stream.of("java", ".net", "python", "jAvA").collect(Collectors.toMap(String::toUpperCase, String::length, (key1, key2) -> key1));
        System.out.println(result);*/

        /*String res=Stream.of("java", ".net", "python", "jAvA").collect(Collectors.joining()).replace(".","");
        System.out.println(res);*/

        /*String res=Stream.of("java", ".net", "python", "jAvA").collect(Collectors.joining("D","Pre","Suff"));
        System.out.println(res);*/

    }
}
