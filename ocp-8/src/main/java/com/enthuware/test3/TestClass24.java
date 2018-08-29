/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware.test3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

interface TriFunction<N, M, O, R> {
    R apply(N n, M m, O o);
}

/**
 * @author Dhiraj
 * @date 23/08/18
 */
public class TestClass24 {
    public static void main(String[] args) {
        TriFunction<String, Double, String, Person> personTriFunction = Person::new;
        Person person = personTriFunction.apply("apple", 5000D, "IT");
        Person person1 = personTriFunction.apply("elephant", 5000D, "IIT");
        Person person2 = personTriFunction.apply("ball", 5000D, "IT");
        Person person3 = personTriFunction.apply("cat", 5000D, "IT");
        Person person4 = personTriFunction.apply("fish", 5000D, "IIT");
        List<Person> people = new ArrayList<>();
        people.add(person);
        people.add(person1);
        people.add(person2);
        people.add(person3);
        people.add(person4);

        //people.stream().collect(Collectors.groupingBy(Person::getDepartment)).forEach((x,y)-> System.out.println(x+":"+y));
        //String joined=people.stream().map(Object::toString).collect(Collectors.joining(","));
        //System.out.println(joined);
        //double salaries=people.stream().collect(Collectors.summingDouble(Person::getSalary));
        //System.out.println(salaries);

        //Map<String, Set<Person>> listMap=people.stream().collect(   Collectors.groupingBy(Person::getDepartment,HashMap::new,Collectors.toSet())    );
        //System.out.println(listMap);
        System.out.println(people);
        //people= people.stream().sorted(Comparator.comparing((x)->x.getDepartment())).collect(Collectors.toList());
        people= people.stream().sorted(Comparator.comparing(Person::getDepartment).thenComparingDouble(Person::getSalary).thenComparing(Person::getName).reversed()).collect(Collectors.toList());

        System.out.println(people);


    }
}

class Person {
    private String name;
    private double salary;
    private String department;

    public Person(String name, double salary, String department) {
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }
}