/*
 * All Rights Reserved @Dhiraj
 */

package com.java.core;

/**
 * @author Dhiraj
 * @date 01/06/18
 */
public class ConsTest {
    public static void main(String[] args) {
        new Beta(3,3);
    }


}

class Alpha{
    public Alpha(){
        System.out.println("Alpha-DC");
    }
    public Alpha(int x,int y){
        System.out.println("Alpha-(int x,int y)");
    }

}
class Beta extends Alpha{

    public Beta(int x,int y){// There is call to super() here before SOP, which call's the DC of super class, if DC is not available in Alpha class, compilation fails
        System.out.println("Beta-(int x,int y)");
    }
}