/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter3;

/**
 * @author Dhiraj
 * @date 07/07/18
 */
public class DuckHelper {
    public static int compareByWeight(Duck d1,Duck d2){
        return d1.getWeight()-d2.getWeight();
    }
    public static int compareByName(Duck d1,Duck d2){
        return d1.getName().compareTo(d2.getName());
    }

}
