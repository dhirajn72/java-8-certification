/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware.mock2;

/**
 * @author Dhiraj
 * @date 03/06/18
 */


class Super { static String ID = "QBANK"; }

class Sub extends Super{
    //static String ID = "QBANK-SUB";
    static { System.out.print("In Sub");
    /*ID=null;*/}
}
public class Test2{
    public static void main(String[] args){
        System.out.println(Sub.ID);
    }
}
