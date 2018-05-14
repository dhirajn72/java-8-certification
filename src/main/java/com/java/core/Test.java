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

/**
 * @author Dhiraj
 * @date 12/05/18
 */
public class Test {
    public static void main(String[] args) {
        Parent1 p= new Parent1();// Allowed even if Constructor is protected, {protected is packaged scope.}
        //This will fail if Test class is moved in another package.
    }
}
