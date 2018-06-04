/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware.mock2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Dhiraj
 * @date 03/06/18
 */

public class TestClass1 {
    public static void main(String[] args) throws Exception {
        List list = new ArrayList();
        list.add("val1");
        list.add(2, "val2");
        list.add(1, "val3");
        System.out.println(list);
    }
}