/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Dhiraj
 * @date 05/07/18
 */
public class TestClass {
    public static void main(String[] args) {
        String[] strings= {"gerbil","mouse"};
        List<String> list= Arrays.asList(strings); //new ArrayList<>();
        //list.add("test1");list.add("test2");
        list.set(1,"test");
        strings[0]="new";
        String[] strings1=(String[]) list.toArray();
        list.remove(1);


        System.out.println(strings);
        System.out.println(strings1);
        System.out.println(list);
        new Byte((byte) 1);
        //new Byte( 1);

        new Byte("1");
        new Short((byte) 1);
        new Short((short) 1);
        //new Short(1);




        new Character('v');
    }
}
