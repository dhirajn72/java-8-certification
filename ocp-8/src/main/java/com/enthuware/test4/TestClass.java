/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware.test4;

interface Inter1 {
    void m1(Inter1 inter1);
}

/**
 * @author Dhiraj
 * @date 23/08/18
 */
public class TestClass {
}

class TestParent {

}

class Test1 extends TestParent implements Inter1 {
    @Override
    public void m1(Inter1 inter1) {
        inter1.m1(new Test1() {
        });
    }

    static class Test1Inner2 {
        final static int id = 0;

        static class Test1Inner3 {
        }

        class Test1Inner4 {
        }

    }

    class Test1Inner extends TestParent {
    }


}


abstract class SomeClass {
    public abstract void m1();
}

class TestClas {
    public static SomeClass getSomeClass()  //note static
    {
        return new SomeClass() {
            public void m1() {
            }
        };
    }
}