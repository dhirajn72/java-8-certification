/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter9;

import com.enthuware.test2.Employee;
import com.ocp.utils.ListUtils;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Dhiraj
 * @date 15/09/18
 */
public class TestClass14 {
    public static void main(String[] args) {
        List<Employee> employees= ListUtils.getEmployees();
        double averageSalary=employees.stream().collect(Collectors.averagingDouble(x->x.getSalary()));
        System.out.println(averageSalary);

        TreeMap<String,List<Employee>>  stringListMap=employees.stream().filter(x->x.getName().length()==3).collect(Collectors.groupingBy(x->x.getName(), TreeMap::new,Collectors.toList()));
        System.out.println(stringListMap);
        System.out.println(stringListMap instanceof TreeMap);

        employees= employees.stream().sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toList()); // Ascending by name
        System.out.println("Ascending order by name:::"+employees);
        employees= employees.stream().sorted((x,y)->y.getName().compareTo(x.getName())).collect(Collectors.toList()); // Descending by name
        System.out.println("Descending order by name:::"+employees);

        employees.stream().collect(Collectors.minBy(Comparator.comparing(Employee::getSalary))).ifPresent(System.out::println);
        employees.stream().collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary))).ifPresent(System.out::println);

        Map<Boolean,List<Employee>> booleanListMap=employees.stream().collect(Collectors.partitioningBy(x->x.getName().length()==3,Collectors.toList()));
        //booleanListMap.forEach((k,v)-> System.out.println(k+":"+v));
        System.out.println(booleanListMap);

        Map<Integer,String> map=employees.stream().collect(Collectors.toMap(x->x.getId(),x->x.getName(),(v1,v2)->v1+","+v2)); //
        //Map<Integer,String> map=employees.stream().collect(Collectors.toMap(x->x.getId(),x->x.getName())); //Exception in thread "main" java.lang.IllegalStateException: Duplicate key elephant at java.util.stream.Collectors.lambda$throwingMerger$0(Collectors.java:133)
        System.out.println(map);
    }
}


