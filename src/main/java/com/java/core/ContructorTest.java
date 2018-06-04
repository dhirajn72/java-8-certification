/*
 * All Rights Reserved @Dhiraj
 */

package com.java.core;

/**
 * @author Dhiraj
 * @date 20/05/18
 */
public class ContructorTest {
}

class Super{


    Super(String x){
    }
    Super(){} // COmpilation fails without this, Because compiler tries to insert DC in Sub class but, if there are no DC in super class, compilation fails
}

class Sub extends Super{
    //Compilation fails if Super class DC is commented out!
}
