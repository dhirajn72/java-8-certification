/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware.test1;

import java.util.Optional;

/**
 * @author Dhiraj
 * @date 14/08/18
 */
public class TestClass9 {
    public static Optional<String> getGrade(int marks) {
        Optional<String> grade = Optional.empty();
        if (marks > 50) {
            grade = Optional.of("PASS");
        } else {
            grade.of("FAIL");
        }
        return grade;
    }

    public static void main(String[] args) {
        Optional<String> grade1 = getGrade(50); //grade1  FAIL
        Optional<String> grade2 = getGrade(55); // grade2 PASS
        System.out.println(grade1.orElse("UNKNOWN")); //FAIL
        if (grade2.isPresent()) {
            grade2.ifPresent(x -> System.out.println(x));// PASS
        } else {
            System.out.println("**");
            System.out.println(grade2.orElse("Empty"));// PASS
        }
    }
}
