/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter2;

/**
 * @author Dhiraj
 * @date 23/07/18
 */
public class EmployeeBuilder {
    private int id;
    private String name;

    public EmployeeBuilder setId(int id) {
        this.id = id;
        return this;
    }
    public EmployeeBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public Employee build(){
        return new Employee(this.id,this.name);
    }

    static  class Employee{
        private int id;
        private String name;

        public Employee(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }
    }
}
