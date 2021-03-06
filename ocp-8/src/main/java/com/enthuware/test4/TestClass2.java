/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware.test4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author Dhiraj
 * @date 24/08/18
 */
public class TestClass2 {
    public static void main(String[] args) {
        Map hm = new ConcurrentHashMap();
        hm.put(null, "asdf");  //1
        hm.put("aaa", null);  //2

        hm = new HashMap();
        hm.put(null, "asdf");  //3
        hm.put("aaa", null);  //4

        List list = new ArrayList();
        list.add(null); //5
        list.add(null); //6

        list = new CopyOnWriteArrayList();
        list.add(null); //7
    }
}
