/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware;

/**
 * @author Dhiraj
 * @date 20/05/18
 */

//What will be printed by the above code if it is run with command line: java TestClass --0.50 (There are two minuses before 0.)
public class TestClass2{
    public static int getSwitch(String str){
        return (int) Math.round( Double.parseDouble(str.substring(1, str.length()-1)) );
    }
    public static void main(String args []){
        switch(getSwitch(args[0])){
            case 0 : System.out.print("Hello ");
            case 1 : System.out.print("World"); break;
            default : System.out.print("Good Bye");
        }
    }
}

