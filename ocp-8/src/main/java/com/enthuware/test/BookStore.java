/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware.test;

enum e1 {
    ;

    enum e2 {
        ;

        enum e3 {

        }
    }
}

/**
 * @author Dhiraj
 * @date 09/08/18
 */
public class BookStore {
    private static final int taxId = 300000;
    private String name;

    public String searchBook(final String criteria) {
        int count = 0;
        int sum = 0;
        sum++;
        name = "something";

        class Enumerator {
            String iterate(int k) {
                //line 1
                System.out.println(taxId);
                System.out.println(name);
                System.out.println(criteria);
                //System.out.println(sum);
                System.out.println(k);
                // lots of code

                return "";
            }
            // lots of code.....
        }
        // lots of code.....
        return "";
    }
}