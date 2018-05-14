/*
 * All Rights Reserved @Dhiraj
 */

package com.java.core;

/**
 * @author Dhiraj
 * @date 14/05/18
 */
public class SwitchTest {
    public static void main(String[] args) {

        byte b=1;
        switch (b){
            case 1:
                System.out.println("case 1");
                //break;
            case 2:
                System.out.println("case 2");
                //break;
            //case 128: //Wont compile !
            case 12:
                System.out.println("case 3");
                //break;
            default:
                    System.out.println("doesn'match !");
        }
        System.out.println("out of switch !!");

        for (int x=1;x<10;x++){
            System.out.println("inside for loop::"+x);
            break;
            //continue;
        }
        System.out.println("main ends !!");

        int[] arr={1,2,3,4,5,6,7,8,9};
        //int x=0;
        //for(x:arr){ //This wont work !!
          for(int x:arr){
              System.out.println(x);
        }








    }
}
