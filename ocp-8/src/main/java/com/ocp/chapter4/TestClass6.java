/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter4;

import java.util.Optional;

/**
 * @author Dhiraj
 * @date 26/07/18
 */
public class TestClass6 {
    public static void main(String[] args) {
        BiFunction<String,String,String> biFunction1= (x,y)->x.concat(y);
        BiFunction<String,String,String> biFunction2= String::concat;
        System.out.println(biFunction1.apply("test","www"));
        System.out.println(biFunction2.apply("test","xyz"));
        BiFunction<String,String,Boolean> biFunction3= String::equalsIgnoreCase;
        System.out.println(biFunction3.apply("test","test"));

        System.out.println("****");
  //      String val="test";
      String val=null;

        Optional o=(val==null)?Optional.empty():Optional.of(val);
        System.out.println(o);
        //System.out.println(o.get());
        System.out.println(Optional.ofNullable(o));
        System.out.println(Optional.ofNullable(val));

    }
}
@FunctionalInterface
interface BiFunction<T,U,R>{
    R apply(T t,U u);
}