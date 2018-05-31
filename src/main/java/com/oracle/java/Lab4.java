package com.oracle.java;

class Lab4{
    public static void main(String[] args){
        Hello4 h = new Hello4();
        h.process();

    }
}

interface Inter4Super{
    default void process(){
        System.out.println("process()-Inter4Super ");
    }

    default void show(){
        System.out.println("show()");
    }

}
interface Inter4Sub extends Inter4Super{
    //interface Inter4Sub{

    //default public int process(){
    default void process(){
        System.out.println("process()-Inter4Sub");
        // return 10;
    }
}

//Change the order of Inteface and test
class Hello4  implements Inter4Super,Inter4Sub{
    // public void process(){
    //     System.out.println("process()-Implementation");
    // }
}
