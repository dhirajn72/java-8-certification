/*
 * All Rights Reserved @Dhiraj
 */

/*
 * All Rights Reserved @Dhiraj
 */

/*
 * All Rights Reserved @Dhiraj
 */

package com.java.core;

import com.java.core.Parent1;

import java.util.Arrays;

/**
 * @author Dhiraj
 * @date 12/05/18
 */
public class Test {
    public static void main(String[] args) {
        Parent1 p= new Parent1();// Allowed even if Constructor is protected, {protected is packaged scope.}
        //This will fail if Test class is moved in another package.

        int x=10;
        int y =3;
        x %= y ;
        System.out.println(x);
        int i = 10;
        int n = i++%5;
        System.out.println(n);

        int []arr[][]=new int[2][3][2];
        arr[0][0][0]=45;
        System.out.println(Arrays.toString(arr[0][0]));


    }
}
