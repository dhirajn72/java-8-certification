/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware.mock1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author Dhiraj
 * @date 29/05/18
 */
public class TestClass3 {
    private String name;

    public TestClass3(String name) {
        this.name = name;
    }

    public static void main(String[] args) {

        Comparator<TestClass3> testClass3Comparator = (TestClass3 t1, TestClass3 t2) -> {
            return t2.name.compareTo(t1.name);
        };
        TestClass3 t1=new TestClass3("zeplin");
        TestClass3 t2=new TestClass3("parrot");
        TestClass3 t3=new TestClass3("parrot");
        TestClass3 t4=new TestClass3("nightingle");

        List<TestClass3> testClass3s= new ArrayList<>();
        testClass3s.add(t1);
        testClass3s.add(t2);
        testClass3s.add(t3);
        testClass3s.add(t4);
        System.out.println("Before sorting:");
        for (TestClass3 ob:testClass3s)
            System.out.println(ob);
        Collections.sort(testClass3s,testClass3Comparator);
        System.out.println("After sorting:");
        for (TestClass3 ob:testClass3s)
            System.out.println(ob);
    }

    @Override
    public String toString() {
        return "TestClass3{" +
                "name='" + name + '\'' +
                '}';
    }
}
