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
public class TestClass38 {
    public static void main(String[] args) {
        Map<Integer,String> map= new HashMap<>();
        map.put(23,"cat");
        map.put(12,"apple");
        map.put(43,"elephant");
        map.put(21,"ball");
        map.put(56,"dog");
        map.forEach((x,y)-> System.out.println(x+":"+y));
        System.out.println("*****");
        LinkedHashMap<Integer,String> linkedHashMap=map.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(x, y)->x,LinkedHashMap::new));
        System.out.println(linkedHashMap);
        Arrays.asList(1,2,3,1,2,3,4).stream().collect(Collectors.toMap(x->x,x->String.valueOf(x),(x,y)->x+","+y)).forEach((x,y)-> System.out.println(x+"="+y));
        ArrayList<Integer> treeSet=Arrays.asList(1,2,3,1,2,3,4).stream().collect(ArrayList::new, ArrayList::add,ArrayList::addAll);
        System.out.println(treeSet);

        System.out.println("****");
        List<Employee> employees= ListUtils.getEmployees();

        Map<Employee,String> employeeStringMap= new HashMap<>();
        employees.stream().forEach(x->employeeStringMap.put(x,x.getName()));
        System.out.println(employeeStringMap);

        Map<Employee,String> employeeStringMap1= employees.stream().collect(Collectors.toMap(x->x,x->x.getName(),(x,y)->y,LinkedHashMap::new));
        System.out.println(employeeStringMap1);
        System.out.println(employeeStringMap1 instanceof LinkedHashMap);
        map.entrySet().stream().sorted(Map.Entry.<Integer, String>comparingByValue().reversed()).collect(Collectors.toMap(x->x.getKey(),x->x.getValue(),(x,y)->x,LinkedHashMap::new)).forEach((x,y)-> System.out.println(x+"="+y));
    }
}
