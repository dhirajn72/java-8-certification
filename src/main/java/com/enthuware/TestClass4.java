/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware;

/**
 * @author Dhiraj
 * @date 30/05/18
 */
public class TestClass4 {
}


class A {
}

class B extends A {
}

class C extends B {
}

class X {
    B getB() {
        return new B();
    }
}

 abstract class Y extends X {
    //method declaration here
    //public C getB(){ return new B(); }
    //C getB(){ return new C(); }
    //protected B getB(){ return new C(); }
     abstract B getB();
}
