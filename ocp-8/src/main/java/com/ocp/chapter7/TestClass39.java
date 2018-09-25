/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter7;

import com.enthuware.test2.Employee;
import com.ocp.utils.ListUtils;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author Dhiraj
 * @date 17/09/18
 */
public class TestClass39 {
    public static void main(String[] args) {
        Test39A<Integer> test39A= new Test39A<>();
        List<Integer> list= new ArrayList<Integer>();
        list.add(23);
        list.add(24);
        list.add(25);
        List<Integer> integers= test39A.<Integer>doStuff(list);
        integers.forEach(System.out::println);
        Map<Integer, String> map=ListUtils.getMapObject();
        LinkedHashMap<Integer,String> map1= map.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(x,y)->x, LinkedHashMap::new));
        System.out.println(map1);
        List<Employee> employees= ListUtils.getEmployees();
        System.out.println(employees.get(employees.size()/2));
    }
}

class Test39A<A>{
    public <A> List<A> doStuff(List<? extends A> as){
        ArrayList<A> as1=new ArrayList<A>();
        as.stream().forEach(as1::add);
        return as1;
    }
}