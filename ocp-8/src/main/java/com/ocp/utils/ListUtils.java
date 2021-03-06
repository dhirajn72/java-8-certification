/*
 * All Rights Reserved @Dhiraj
 */

/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.utils;

import com.enthuware.test2.Employee;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Dhiraj
 * @date 15/09/18
 */
public class ListUtils {
    public static List<Employee> getEmployees() {
        List<Employee> employees = new ArrayList<>();
        Employee employee1 = new Employee(1, "elephant", 10);
        Employee employee2 = new Employee(1, "ball", 20);
        Employee employee3 = new Employee(3, "cat", 30);
        Employee employee4 = new Employee(4, "dog", 40);
        Employee employee5 = new Employee(5, "apple", 50);
        Employee employee6 = new Employee(5, "fish", 50);

        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        employees.add(employee5);
        return employees;
    }

    public static Map<Integer, String> getMapObject() {
        Map<Integer, String> map = new HashMap<>();
        map.put(23, "cat");
        map.put(12, "apple");
        map.put(43, "elephant");
        map.put(21, "ball");
        map.put(56, "dog");
        return map;
    }
}
