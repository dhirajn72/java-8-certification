/*
 * All Rights Reserved @Dhiraj
 */

package com.oracle;

/**
 * @author Dhiraj
 * @date 20/05/18
 */
interface Inter1 {
    default void process() {
        System.out.println("process()");
    }

    default void show() {
        System.out.println("show()");
    }

}

public class Lab1 {
    public static void main(String[] args) {

        Hello h = new Hello();
        h.process();

    }
}

class Hello implements Inter1 {
    public void process() {
        System.out.println("process()- Implementation");
        Inter1.super.process();
    }


}
