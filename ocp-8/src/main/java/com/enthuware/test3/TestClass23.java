/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware.test3;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author Dhiraj
 * @date 22/08/18
 */
public class TestClass23 {
    public static void main(String[] args) {
        List<Student> ls = Arrays.asList(new Student("S1", Student.Grade.A), new Student("S2", Student.Grade.A), new Student("S3", Student.Grade.C));

        Map<Student.Grade, List<String>> grouping = ls.stream().collect(
                Collectors.groupingBy(Student::getGrade,
                        Collectors.mapping(Student::getName, Collectors.toList()))); // {A=[S1,S2] ,C=[S3]}  ///{C=[S3], A=[S1, S2]}
        System.out.println(grouping);
    }
}


class Student {

    public static enum Grade{ A, B , C, D, F}

    private String name;
    private Grade grade;
    public Student(String name, Grade grade){
        this.name = name;
        this.grade = grade;
    }
    public String toString(){
        return name+":"+grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }
}


