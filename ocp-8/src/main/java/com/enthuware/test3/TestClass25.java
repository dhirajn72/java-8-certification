/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware.test3;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * @author Dhiraj
 * @date 25/08/18
 */



public class TestClass25 {
    public static void main(String[] args) {
        Stream<String> names = Stream.of("Sarah Adams", "Suzy Pinnell", "Paul Basgall");
        Stream<String> firstNames1 = names.map(e->e.split(" ")[0]);
        System.out.println(Arrays.toString(firstNames1.toArray()));
        System.out.println(firstNames1.toArray());

    }
}
