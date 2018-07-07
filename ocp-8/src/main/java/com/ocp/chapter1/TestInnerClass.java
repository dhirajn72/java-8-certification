/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter1;

import com.ocp.pack1.*;
//import static com.ocp.pack1.OuterClass.InnerClass;


/**
 * @author Dhiraj
 * @date 03/07/18
 */
public class TestInnerClass {
    public static void main(String[] args) {
        OuterClass.InnerClass innerClass= new OuterClass().new InnerClass();
    }
}
