/*
 * All Rights Reserved @Dhiraj
 */

package com.kathy.seira.chapter1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Dhiraj
 * @date 17/06/18
 */
public class TestClass1 {
    public static void main(String[] args) {
        List<Integer> integers= new ArrayList<>();
        integers.add(99);
        integers.add(2,88);

        System.out.println(integers);
    }
}
