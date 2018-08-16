/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware.test1;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author Dhiraj
 * @date 14/08/18
 */
public class TestClass7 {
    public static void main(String[] args) {

        IntStream is1 = IntStream.range(1, 3);
        IntStream is2 = IntStream.rangeClosed(1, 3);
        IntStream is3 = IntStream.concat(is1, is2);
        //Object val=is3.boxed().collect(Collectors.groupingBy(k->k)).get(3);
        //System.out.println(val);
        is3.boxed().collect(Collectors.groupingBy(k->k)).forEach((x,y)-> System.out.println(x+" "+y));

        /**
         * 1 2
         * 1 2 3
         */
    }
}
