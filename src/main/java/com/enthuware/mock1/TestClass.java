/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware.mock1;

/**
 * @author Dhiraj
 * @date 27/05/18
 */

public class TestClass{
    int x = 5;
    int getX(){ return x; }

    public static void main(String args[]) throws Exception{
        TestClass tc = new TestClass();
        tc.looper();
        System.out.println(tc.x);
    }

    public void looper(){
        int x = 0;
        while( (x = getX()) != 0 ){
            for(int m = 10; m>=0; m--){
                x = m;
            }
            System.out.println("infinite loop");
        }

    }
}
