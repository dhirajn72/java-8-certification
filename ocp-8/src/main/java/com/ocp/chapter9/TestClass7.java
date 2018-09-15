/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter9;

import com.enthuware.test2.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Dhiraj
 * @date 13/09/18
 */
public class TestClass7 {
    public static void main(String[] args) {

        int[] ints= {30,25,22,-20,10,-12,15};
        Arrays.sort(ints);
        System.out.println(Arrays.toString(ints));
        System.out.println(Arrays.binarySearch(ints,50));
        System.out.println(Arrays.binarySearch(ints,25));
        new Byte((byte) 1);
        new Short((short) 1);
        new Double(7l);

        List<Employee>  employees= new ArrayList<Employee>();
        employees.add(new Employee(12,"A",20));
        addEmp(employees);
        System.out.println(employees);

        List< Number> numbers= new ArrayList<>();
        numbers.add(new Integer(2));





    }

    private static void addEmp(List employees) {
        employees.add("why this kolaveri");
    }

    <X> void m1(List<? extends Number> numbers){


    }

}
