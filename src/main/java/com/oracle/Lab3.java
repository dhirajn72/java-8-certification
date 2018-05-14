package com.oracle;
class Lab3{
    public static void main(String[] args){

Hello3 h = new Hello3();
h.process();

    }
}

interface Inter3{
    default void process(){
    System.out.println("process()-Inter2 ");  
    }
    
    default void show(){
           System.out.println("show()");
    }

}

class Hello3  extends SuperClass3 implements Inter3{
    public void process(){
       System.out.println("process()- Implementation");
       Inter3.super.process();
       super.process();
    }
}


class SuperClass3{
    public void process(){
    System.out.println("process()-SuperClass1");  
    }
}
