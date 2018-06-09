/*
 * All Rights Reserved @Dhiraj
 */

package com.java.lambda;

import java.util.function.Predicate;

/**
 * @author Dhiraj
 * @date 06/06/18
 */
public class Test3 {
    public static void main(String[] args) {
        Test3 t= new Test3();
        t.show(x->adder(2,3)>4);
        t.show(x->{return adder(2,3)>4;});
        t.show(x->false);
        t.show(x->true);


    }

    static int adder(int x, int y) {
        return x + y;
    }

    void show(Predicate e) {
        Test3 t = new Test3();
        System.out.println(e.test(null) ? "ternary-true" : "ternary-false");
    }
}
