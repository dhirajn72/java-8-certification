/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter3;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Dhiraj
 * @date 06/07/18
 */
public class TestClass2 {
    public static void main(String[] args) {
        //List<Super> supers= new ArrayList<Sub>();
        //supers=new ArrayList<Super>();
        Object[] o1= new String[1];
        Object o2= new String[1];

        List<String > list= new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        System.out.println(list);
        list.add(1,"D");
        System.out.println(list);
        String x=list.set(1,"X");
        System.out.println(list+" "+x);



    }
}

class Super{

}
class Sub extends Super{

}
