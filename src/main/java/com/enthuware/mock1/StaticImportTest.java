/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware.mock1;

//import static java.lang;// invalid
// import static java.lang.Integer; //Invalid
         import static java.lang.Integer.*; //Valid
// static import java.lang.Integer.*; //invalid
        import static java.lang.Integer.MAX_VALUE; //Valid

/**
 * @author Dhiraj
 * @date 29/05/18
 */
public class StaticImportTest {
    public static void main(String[] args) {
        System.out.println(Integer.MIN_VALUE);


    }
}
