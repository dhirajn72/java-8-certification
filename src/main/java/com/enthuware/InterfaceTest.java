/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware;

/**
 * @author Dhiraj
 * @date 30/05/18
 */
public class InterfaceTest {
    public static void main(String[] args) throws Exception{
        new Test("dk",99);
        System.out.println(args.length);
        System.out.println(args);
    }
}


class Test{
    String name;
    int id;
    public Test() throws Exception{
        System.out.println("DC");
    }

    public Test(String name, int id)/* throws Exception*/{
        //this();
        this.name = name;
        this.id = id;
        System.out.println("Test(String name, int id)");
    }
}

interface InterTest{
    static public void m1(){

    }
    default public void m2(){

    }
}