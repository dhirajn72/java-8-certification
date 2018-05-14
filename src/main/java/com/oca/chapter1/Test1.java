/*
 * All Rights Reserved @Dhiraj
 */

package com.oca.chapter1;

/**
 * @author Dhiraj
 * @date 11/05/18
 */
public class Test1 {
    public static void main(String[] args) {
        final Test1 t = new Test1();
        //t=null;
        System.out.println(Coffe.BIG);
        int x = 190;
        if (x < 13)
            if (21 > 3)
                if (x > 10)
                    System.out.println("x is greater");
                else
                    System.out.println("x is smaller");
            else
                System.out.println("Test");

    }

    enum Coffe {
        BIG(89),
        SMALL(23);

        private Coffe(int i) {
            System.out.println("enum-cons:::" + i);
        }
    }


}
