/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware.test1;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author Dhiraj
 * @date 14/08/18
 */
public class TestClass8 {

    public static void main(String[] args) {
        List<Course> s1 = Arrays.asList(
                new Course("OCAJP", "Java"),
                new Course("OCPJP", "Java"),
                new Course("C#", "C#"),
                new Course("OCEJPA", "Java")
        );
        s1.stream().collect(Collectors.groupingBy(c -> c.getCategory())).forEach((m, n) -> System.out.println(m+":"+n));

        List<Integer> ls = Arrays.asList(1, 2, 3);
        Function<Integer, Integer> func = a->a*a; //1
        ls.stream().map(func).peek(System.out::print).count();

        System.out.println("***");
        List<String> vals = Arrays.asList("a", "b");
        String join = vals.parallelStream().reduce("_", (a, b)->a.concat(b));
        System.out.println(join);
        System.out.println("*****");
        List<String> names = Arrays.asList("greg", "dave", "don", "ed", "fred" );
        Map<Integer, Long> data = names.stream().collect(Collectors.groupingBy(
                String::length,
                Collectors.counting()) );
        System.out.println(data.values());
        System.out.println(data);
        System.out.println("******");
        List<Student1> ls1 = Arrays.asList(new Student1("S1", 20), new Student1("S3", 30), new Student1("S3", 20) );
        Map<Integer,List<Student1>> grouping=ls1.stream().collect(Collectors.groupingBy(x->x.getMarks()));
        System.out.println(grouping);
    }
}

class Course {
    private String id;
    private String category;

    public Course(String id, String category) {
        this.id = id;
        this.category = category;
    }

    @Override
    public String toString() {
        return id + " " + category;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
class Student1 {
    private String name;
    private int marks;
    public Student1(String name, int marks){
        this.name = name;
        this.marks = marks;
    }
    public String toString(){
        return name+":"+marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }
}