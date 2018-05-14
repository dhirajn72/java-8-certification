package com.oracle;

class Lab2{
    public static void main(String[] args){

Hello2 h = new Hello2();
h.process();

    }
}

interface Inter2{
    default void process(){
    System.out.println("process()-Inter2 ");  
    }
    
    default void show(){
           System.out.println("show()");
    }

}

class Hello2  extends SuperClass1 implements Inter2{
    public void process(){
       System.out.println("process()- Implementation");
      // Inter2.super.process();
      // super.process();
    }
}


class SuperClass1{
    public void process(){
    System.out.println("process()-SuperClass1");  
    }
}
