/*
 * All Rights Reserved @Dhiraj
 */

/*
 * All Rights Reserved @Dhiraj
 */

package com.oracle.java.core;

class Lab4{
    public static void main(String[] args){

        Hello2 h = new Hello2();
        h.process();

    }
}

interface Inter5{
    default void process(){
        System.out.println("process()-Inter2 ");
    }

    default void show(){
        System.out.println("show()");
    }

}

class Hello2  extends SuperClass2 implements Inter5{
    public void process(){
        System.out.println("process()- Implementation");
        // Inter2.super.process();
        // super.process();
    }
}


class SuperClass2{
    public void process(){
        System.out.println("process()-SuperClass1");
    }
}
