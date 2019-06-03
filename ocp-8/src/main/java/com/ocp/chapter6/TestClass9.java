/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter6;

/**
 * @author Dhiraj
 * @date 01/08/18
 */
public class TestClass9 {
    public static void main(String[] args) {
        args=new String[]{"hi","there"};
        if(args.length<=3)
            assert false:"fails";
        System.out.println(args[0]+args[1]);
    }
}
