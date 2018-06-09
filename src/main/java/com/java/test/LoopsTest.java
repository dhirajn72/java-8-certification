/*
 * All Rights Reserved @Dhiraj
 */

package com.java.test;

/**
 * @author Dhiraj
 * @date 07/06/18
 */
 class LoopsTest {
    public static void main(String[] args) {
        /*do
            do
                do
                    do
                        do
                            do
                                do
                                    do
                                        System.out.println();
                                    while(true);
                                while(true);
                            while(true);
                        while(true);
                    while(true);
                while(true);
            while(true);
        while(true);*/

        do
            while(true)
            System.out.println();
        while(true);


        //System.out.println(false);
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("finalize called");
        super.finalize();
    }
}
