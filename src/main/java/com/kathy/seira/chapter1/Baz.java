/*
 * All Rights Reserved @Dhiraj
 */

package com.kathy.seira.chapter1;

import com.pkgA.Foo;

/**
 * @author Dhiraj
 * @date 16/06/18
 */
public class Baz {
    public static void main(String[] args) {
        Foo f = new Foo();
        //Sub f = new Sub();
        //System.out.print(" " + f.a);
        //System.out.print(" " + f.b);
        System.out.println(" " + f.c);
        //System.out.println(new Sub().show());
    }
}


class Sub extends Foo {

    void  show() {
        // System.out.print(" " + this.a);
        //System.out.println(" " + this.b);
        //return this.b;
    }
}