/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware;

import java.io.IOException;

/**
 * @author Dhiraj
 * @date 31/05/18
 */
public class TestEnum {
    enum Test{MON,TUE,WED};

    static int x=90;

    public static void main(String[] args) {
        Test t=null;
        System.out.println(t.MON);

        System.out.println("******");

        TestEnum t1=null;
        System.out.println(t1.x);//TestEnum.x;
        t1.show(); //TestEnum.show();
    }

    static void show(){
        System.out.println("show()");
    }

    /*int m1(){return 0;}
    void m1(){}*/
}


interface InterfaceTest1{
    int m1() throws IOException;
}
class Test2 implements InterfaceTest1{

    /*@Override
    public int m1() throws Exception{ // Illegal, ovverriden method can't throw Super type of exception declared in parent interface
        return 0;
    }*/

    /*@Override
    public byte m1() throws Exception{ // Illegal, primitives are not covarrieant.
        return 0;
    }*/


    @Override
    public int m1() { // Legal, overriden methid can ignore the exception which is throw n by super type
        return 0;
    }
}

class Alpha{
    Alpha doStuff(){
        return new Alpha();
    }
    int doStuff(int x){
        return 0;
    }

}

class Beta extends Alpha{

    @Override
    Beta doStuff() {
        //return new Alpha();
        return new Beta();
    }

    @Override
    int doStuff(int x) {
        //char y=9;
        short y=9;
        //byte y=9;

        return y; //Legal, char can fit into int, All three can be returned from this method
    }
    /*@Override
    int doStuff(int x) {
        long l=9L;
        return l; //Not Legal, long can't fit into int
    }*/
}

