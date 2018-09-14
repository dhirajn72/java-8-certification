/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter9;

import java.util.Optional;

/**
 * @author Dhiraj
 * @date 14/09/18
 */
public class TestClass9 {
    public static void main(String[] args) {
        Optional<String> optional=getValue("test");
        System.out.println(optional);
        optional.ifPresent(x-> System.out.println(x));
        System.out.println(optional.orElse("other"));
        System.out.println(optional.orElseGet(()->"other supplier"));
        System.out.println(optional.orElseThrow(()->new RuntimeException("nothing found!")));
        
    }
    private static Optional<String> getValue(String x) {
        //return Optional.empty();
        //return null;
        Optional<String> s= Optional.ofNullable(null);
        if (!s.isPresent())
            return s;
        System.out.println(s.get());
        return s;
    }
}
