/*
 * All Rights Reserved @Dhiraj
 */

package com.java.misc;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @author Dhiraj
 * @date 21/08/18
 */
public class TestClass14 {
    public static void main(String[] args) {
        List<Employee> employees=new ArrayList<>();
        employees.add(new Employee(45,"apple"));
        employees.add(new Employee(21,"Apple"));
        employees.add(new Employee(32,"elephant"));
        employees.add(new Employee(12,"zebra"));
        employees.add(new Employee(10,"cat"));

        System.out.println("**Before sorting**");
        employees.forEach(System.out::println);

        System.out.println("**Sorting on id ascending order**");
        employees.stream().sorted(Comparator.comparingInt(Employee::getId)).forEach(System.out::println);

        System.out.println("**Sorting on id descending order**");
        employees.stream().sorted((a,b)->b.getId()-a.getId()).forEach(System.out::println);

        System.out.println("**Sorting on name ascending order**");
        employees.stream().sorted(Comparator.comparing(Employee::getName)).forEach(System.out::println);

        System.out.println("**Sorting on name descending order**");
        employees.stream().sorted((a,b)->b.getName().compareTo(a.getName())).forEach(System.out::println);

    }
}

class Employee{
    private int id;
    private String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}