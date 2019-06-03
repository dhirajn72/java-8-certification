/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter3;

/**
 * @author Dhiraj
 * @date 24/07/18
 */
public class TestClass10 {
    public static void main(String[] args) {
       // System.out.println(Assertion.<String>ship("Main"));
        //System.out.println(Assertion.<String[]>ship(new String[]{"x","y","z"}));

    }

    public static <T> T ship(T t){
        //public static  T ship(T t){       //Invalid
        //return new Generic<T>();
        //return new T();                      //Not Allowed
        return null;
    }

}


interface Shippable<T>{
    T ship(T t);
    void shipIt(T t);
}

class Generic<T>{

}