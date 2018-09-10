/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware.test3_a;

/**
 * @author Dhiraj
 * @date 05/09/18
 */
public class TestClass32 {
    static void m1() {
        class M1Inner extends TestClass32 {
        }
        class M2Inner extends Outer {
        }
    }
    static class Inner1 {
        static int x = 0;
        static class Inner2 {
            static final int x = 0;
            static class Inner3 {
                static final int x = 0;
                static class Inner4 {
                    static final int x = 0;
                }
            }
        }
        class Inner3 {
            static final int x = 0;
        }
    }
    class Inner2 {
        static final int x = 0;
    }
}

class Outer { }