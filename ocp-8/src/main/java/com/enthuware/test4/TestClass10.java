/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware.test4;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Dhiraj
 * @date 27/08/18
 */
public class TestClass10 {

    public static void main(String[] args) {
        Employee e1= new Employee(1,"a");
        Employee e2= new Employee(1,"a");

        Set<Employee> employees= new HashSet<>();
        employees.add(e1);
        employees.add(e2);
        for (Employee e:employees)
            System.out.println(e);


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

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Employee){
            Employee e=(Employee)obj;
            //return this.id==e.getId() && this.name.equalsIgnoreCase(e.getName());
            return false;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.id;
    }
}
