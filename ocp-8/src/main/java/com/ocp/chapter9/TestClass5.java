/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter9;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Dhiraj
 * @date 13/09/18
 */
public class TestClass5 {
    public static void main(String[] args) {
        List<? extends Test5A> test5AS= new ArrayList<>();
        List<Test5A> test5AS1= new ArrayList<>();
        test5AS=test5AS1;
        /*test5AS.add(new Test5B());
        test5AS.add(new Test5A());*/
        test5AS1.add(new Test5B());
        test5AS1.add(new Test5A());

    }
}
class Test5A{
}
class Test5B extends Test5A{
}