/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware.mock2;


/**
 * @author Dhiraj
 * @date 03/06/18
 */
public class Test1 {
    char c;

    public static void main(String[] args) {
        //Short s= new Short(9); //Illegal
        short s = 9;
        Short k = 9;

        //System.out.println(s instanceof Short);
        System.out.println(k instanceof Short);

        Object o = new String("A");
        System.out.println(o);
        System.out.println((int) new Test1().c);
        System.out.println((int) '0');
        char ch = 0;
        System.out.println(ch);

        byte b = 1;
        char c = 1;
        short s1 = 1;
        int i = 1;

        short x = 3;
        x += 4.6;
        System.out.println(x);

        System.out.println("********");
        A a = new A();
        B b1 = new B();

        a= (B)(I)b1;
        System.out.println(a);
        int d=1__________________________________________________________________________________________3______0;
        System.out.println(d);
        float f=1____________3_______0f;
        System.out.println(f);

    }
}



interface I{
}
class A implements I{
}

class B extends A {
}

class C extends B{
}

