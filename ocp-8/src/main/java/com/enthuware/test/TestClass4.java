/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware.test;

import java.util.ArrayList;
import java.util.Date;

/**
 * @author Dhiraj
 * @date 11/08/18
 */

class Person{
    String name;
    String dob;
    public Person(String name, String dob){
        this.name = name; this.dob = dob;
    }
}
class MySorter {
    public int compare(Person p1, Person p2){
        return p1.dob.compareTo(p2.dob);
    }
}
public class TestClass4 {
    public static int diff(Person p1, Person p2){
        return p1.dob.compareTo(p2.dob);
    }

    public static int diff(Date d1, Date d2){
        return d1.compareTo(d2);
    }
    public static void main(String[] args) {
        ArrayList<Person> al = new ArrayList<>();
        al.add(new Person("Paul", "01012000"));
        al.add(new Person("Peter", "01011990"));
        al.add(new Person("Patrick", "01012002"));
        java.util.Collections.sort(al, (p1, p2)->p1.dob.compareTo(p2.dob));
        java.util.Collections.sort(al, TestClass4::diff);
        java.util.Collections.sort(al, new MySorter()::compare);
    }
}