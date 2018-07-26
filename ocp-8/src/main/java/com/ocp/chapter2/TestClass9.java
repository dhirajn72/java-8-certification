/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter2;

/**
 * @author Dhiraj
 * @date 23/07/18
 */
public class TestClass9 {
    public static void main(String[] args) {

        EmployeeBuilder.Employee employee= new EmployeeBuilder()
                .setId(99)
                .setName("Dhiraj")
                .build();
    }
}
