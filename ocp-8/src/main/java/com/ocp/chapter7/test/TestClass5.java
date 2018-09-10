/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter7.test;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Dhiraj
 * @date 31/08/18
 */
public class TestClass5 {
    public static void main(String[] args) {
        Stream<String> cats=Stream.of("leoperd","lynx","ocelot","puma").parallel();
        Stream<String> bears=Stream.of("panda","grizzly","polar").parallel();
        ConcurrentMap<Boolean,List<String>> concurrentHashMap=Stream.of(cats,bears)
                .flatMap(s->s)
                .collect(Collectors.groupingByConcurrent(s->!s.startsWith("p")));
        System.out.println(concurrentHashMap.get(false).size()+" "+concurrentHashMap.get(true).size());
        System.out.println(concurrentHashMap);
    }
}
