/*
 * All Rights Reserved @Dhiraj
 */

package com.java.lambda;

/**
 * @author Dhiraj
 * @date 16/05/18
 */
public class Test1 {
    public static void main(String[] args) {
        Inter1 inter1= (a, b) -> System.out.println(a+b);
        System.out.println("This anonymous implementation does not takes any parameters");
        System.out.println("We can have any number");
        System.out.println("of statements here!!");
        System.out.println();
        //System.out.println(a+b);

        inter1.operation(2,3);
        Inter2 inter2= (x,y) -> {return 0;};//{
            /*int res=0;
            res=x*y;
            System.out.println("Under Lambda::"+res);
            return res;*/

       // };
        int res=inter2.operation(4,4);
        System.out.println("Outside lambda::"+res);

        Inter3 inter3=()->{
            System.out.println("This anonymous implementation does not takes any parameters");
            System.out.println("We can have any number");
            System.out.println("of statements here!!");
            };
        inter3.operation();





    }
}
