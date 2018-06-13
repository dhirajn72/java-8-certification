/*
 * All Rights Reserved @Dhiraj
 */

package com.java.lambda;

import java.util.function.Predicate;

/**
 * @author Dhiraj
 * @date 10/06/18
 */


class Employee {
    int age;
}

public class TestClass1 {
    public static boolean validateEmployee(Employee e, Predicate<Employee> p) {
        return p.test(e);
    }

    public static void main(String[] args) {
        Employee e = new Employee();
        System.out.println(validateEmployee(e, y -> y.age < 10000));
        System.out.println(7+8<9);
    }
}