/*
 * All Rights Reserved @Dhiraj
 */

package com.java.core;

/**
 * @author Dhiraj
 * @date 20/05/18
 */
/*
 * All Rights Reserved @Dhiraj
 */

public class LabeledLoops {
    public static void main(String[] args) {

        outer:
        for (int i=0;i<5;i++){
            for (int j=0;j<5;j++){
                System.out.println(i+" "+j);
                //break outer;
                continue  outer;
            }
        }
        System.out.println("out from outer!!");
        int age=0;
        outer:
        while (true){
            while (age==18){
                System.out.println("eligible!!"+age);
                break outer;
            }
            age++;
            System.out.println("not Eligible!!"+age);
        }
    }
}

