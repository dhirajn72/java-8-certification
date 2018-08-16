/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Dhiraj
 * @date 12/08/18
 */
public class TestClass15 {

        public static void main(String[] args)
        {
            //Map<Object,?> m=new HashMap<Object, Object>();
            Map m=new HashMap();

            m.put("1", new ArrayList<>());    //1
            m.put(1, new Object());    //2
            m.put(1.0, "Hello");     //3
            System.out.println(m);
        }
}
