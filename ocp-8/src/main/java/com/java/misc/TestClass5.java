/*
 * All Rights Reserved @Dhiraj
 */

package com.java.misc;

/**
 * @author Dhiraj
 * @date 01/08/18
 */
public class TestClass5 {
    public static void main(String[] args) {

        Super[] aSuper= {new Sub1(),new Sub2(),new Sub3()};
        for (Super s:aSuper){
            s.m1();
        }
        Super s1=new Sub1();
        if (s1 instanceof Sub1){
            System.out.println("true");
            Sub1 s2=(Sub1) s1;
            s2.m1();
        }
    }
}
class Super{
    void m1(){
        m2();
    }
    void m2(){
        System.out.println("super-m2");
    }
}
class Sub1 extends Super{
    @Override
    void m2() {
        System.out.println("sub1-m2");
    }
}

class Sub2 extends Super{
    @Override
    void m2() {
        System.out.println("sub2-m2");
    }
}

class Sub3 extends Super{
    @Override
    void m2() {
        System.out.println("sub3-m2");
    }
}


