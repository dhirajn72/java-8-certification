/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter9;

import com.enthuware.test2.Employee;
import com.ocp.utils.ListUtils;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author Dhiraj
 * @date 15/09/18
 */
public class TestClass15 {
    public static void main(String[] args) {
        IntStream intStream = IntStream.of(1, 2, 3, 4, 5);
        intStream.findAny().ifPresent(System.out::println);
        Stream.generate(() -> "1").limit(2).filter(x -> x.length() > 1).forEach(System.out::println);
        String x1 = Stream.iterate(1, x -> ++x).limit(5).map(x -> x + "").collect(Collectors.joining("X"));
        System.out.println(x1);

        List<Employee> employees = ListUtils.getEmployees();

        //String res= employees.stream().sorted((x,y)->y.getName().compareTo(x.getName())).map(x->x.getName()).collect(Collectors.joining());
        String res = employees.stream().sorted(Comparator.comparing(Employee::getName)).map(x -> x.getName()).collect(Collectors.joining());
        System.out.println(res);
        employees.stream().min(Comparator.comparing(Employee::getSalary)).ifPresent(System.out::println);
        //employees.stream().collect(Collectors.minBy(Comparator.comparing(Employee::getSalary))).ifPresent(System.out::println);
        employees.stream().min(Comparator.comparing((x)->x.getName())).ifPresent(System.out::println);
        employees.stream().min((x,y)->y.getName().compareTo(x.getName())).ifPresent(System.out::println);
        employees.stream().min((x,y)->y.getId()-x.getId()).ifPresent(System.out::println);
    }
}
