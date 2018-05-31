/*
 * All Rights Reserved @Dhiraj
 */

package com.java.oracle;

import com.enthuware.mock1.Super;

/**
 * @author Dhiraj
 * @date 31/05/18
 */
public class MethodOverloading {
    public static void main(String[] args) {
        new MethodOverloading().print((short)7);
        Super s= new SubClass();
        s.m1();

    }

    public void print(short s){
        System.out.println("print(short s)");

    }
    public void print(short... s){
        System.out.println("print(short... s)");

    }

}

/*class SuperClass{
     void m1(){

    }
}*/
/*abstract class SubClass extends Super{
    abstract void m1();
}*/
 class SubClass extends Super{
     public void m1(){
         System.out.println("SubClass-m1()");
     }
}

/*interface SuperClass{
     void m1();
}
class SubClass implements    SuperClass{
    public void m1(){

    }
}*/
