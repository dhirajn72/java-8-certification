/*
 * All Rights Reserved @Dhiraj
 */

package com.java.misc;

/**
 * @author Dhiraj
 * @date 20/08/18
 */
public class TestClass9 {
    public static void main(String[] args) {
        A a= new A();
        B b = new B();
      //  Inter<B,A> i= (b1,a1)-> {return a1;};
    }
    public static void m1(Inter<B,A> i){
    }
}

class Test1 implements Inter<B,A>{
    @Override
    public <B extends A> A doIt(B t) {
        return null;
    }
}
@FunctionalInterface
interface Inter<T,R>{
    <T extends R> R doIt(T t);
}
class A{ }
class B extends A{ }