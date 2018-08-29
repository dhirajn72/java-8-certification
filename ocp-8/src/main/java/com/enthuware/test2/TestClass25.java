/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware.test2;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListSet;

/**
 * @author Dhiraj
 * @date 26/08/18
 */
public class TestClass25 {
    public static void main(String[] args) {

        //Set<String> strings=new ConcurrentSkipListSet<>();
        Set<String> strings=new HashSet<>();
        strings.add(null);

        Map<Integer,String>  map= new ConcurrentHashMap<>();
        map.put(1,"a");
       // map.put(null,"a");
       // map.put(2,null);

    }
}
