/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware.test1;

import java.util.function.IntFunction;
import java.util.function.IntUnaryOperator;

/**
 * @author Dhiraj
 * @date 13/08/18
 */

public class TestClass5 {
    public static int operate(IntUnaryOperator iuo) {
        return iuo.applyAsInt(5);
    }

    public static void main(String[] args) {
        //IntFunction<IntUnaryOperator> fo = a -> (b -> (a - b));  //1
        IntFunction<IntUnaryOperator> fo = a->b->a-b;  //1

        int x = operate(fo.apply(20)); //2
        System.out.println(x);
    }
}