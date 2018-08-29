/*
 * All Rights Reserved @Dhiraj
 */

/*
 * All Rights Reserved @Dhiraj
 */

/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware.test1;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author Dhiraj
 * @date 21/08/18
 */

public class ArraySorting {
    public static void main (String[] args) {
        List<Employee> list = new ArrayList<>();
        Employee e = new Employee ();
        e.setName ("aaa").setId (1);
        list.add (e);
        e = new Employee ();
        e.setName ("bbb").setId (2);
        list.add (e);
        e = new Employee ();
        e.setName ("ccc").setId (3);
        list.add (e);
        e = new Employee ();
        e.setName ("aaa").setId (1);
        list.add (e);
        /*Collections.sort (list, new Comparator<Employee> () {
            @Override
            public int compare (Employee o1, Employee o2) {
                return o2.getName ().compareTo (o1.getName ());
            }
        });*/
        //list.sort (( o1, o2) -> o2.getName ().compareTo (o1.getName ()) );
        list.sort (Comparator.comparing(x->x.getName()));
        Set<Employee> s = new HashSet<>();
        s.addAll (list);
        list = new ArrayList<> ();
        list.addAll (s);
        for (Employee emp : list) {
            System.out.println (emp.getName ());
        }
    }
}
class Employee {
    private String name;
    private int id;

    public Employee setId (int id) {
        this.id = id;
        return this;
    }

    public Employee setName (String name) {
        this.name = name;
        return this;
    }

    public int getId () {
        return this.id;
    }

    public String getName () {
        return this.name;
    }

    @Override
    public int hashCode() {
        return this.id;
    }

    @Override
    public boolean equals(Object e) {
        if(e instanceof Employee) {
            if(this.name.equals (((Employee) e).getName ()) && this.id == ((Employee) e).getId ()) {
                return true;
            }
        }
        return false;
    }
}