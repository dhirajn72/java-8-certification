/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware.test3;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Dhiraj
 * @date 21/08/18
 */
public class TestClass17 {
    public static void main(String[] args) {

        List<Employee>  employees= new ArrayList<>();
        employees.add(new Employee(12,"apple"));
        employees.add(new Employee(3,"Ox"));
        employees.add(new Employee(21,"Cat"));
        employees.add(new Employee(13,"Elephant"));
        employees.add(new Employee(4,"dog"));
        employees.stream().sorted((a,b)->b.getId()-a.getId()).forEach(System.out::println);
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
        return id+":"+name;
    }
}