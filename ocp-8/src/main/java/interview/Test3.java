/*
 * All Rights Reserved @Dhiraj
 */

package interview;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Dhiraj
 * @date 30/03/19
 */
public class Test3 {
    public static void main(String[] args) {
        List<? extends Object> list1= new ArrayList<String>();
        //List<? super Object> list2= new ArrayList<String>();
        List<? super String> list2= new ArrayList<Object>();
        //List<Object> list2= new ArrayList<String>();

        List<Integer> integers= new LinkedList<>();
       // List<Integer> integers= new ArrayList<>();

        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add(5);
        System.out.println(integers);
        integers.add(2,10);
        System.out.println(integers);
        //integers.remove(new Integer(2));
        System.out.println(integers);





    }
}
