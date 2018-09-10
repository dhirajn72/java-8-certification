/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware.test3_a;

import java.io.Console;
import java.util.Scanner;

/**
 * @author Dhiraj
 * @date 02/09/18
 */
public class TestClass3 {
    public static void main(String[] args) {
        Console c= System.console();
        Scanner sc= new Scanner(System.in);
        String id = c.readLine("%s", "Enter UserId:"); //1
        System.out.println("userid is " + id); //2
        char[] pwd = c.readPassword("%s", "Enter Password :"); //3
        System.out.println("password is " + pwd); //4
    }
}
