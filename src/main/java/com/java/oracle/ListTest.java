/*
 * All Rights Reserved @Dhiraj
 */

package com.java.oracle;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Dhiraj
 * @date 05/06/18
 */
public class ListTest {
    public static void main(String[] args) {
        List<String> strings= new ArrayList<>();
        strings.add("rama");
        strings.add("suma");
        strings.add("dk");
        strings.add("jullu");
        strings.add("123");
        if (strings.contains(new String("suma")))
            strings.add("oracle");
        System.out.println(strings);
        System.out.println(strings.contains(new String("123")));
        StringBuilder str= new StringBuilder("I good! ");
        str.insert(2,"look ").append("and nice");
        str.insert(str.length(),"!!!");
        System.out.println(str+" "+str.length());
        str.delete(str.length()-2,str.length());
        System.out.println(str+" "+str.length());
        System.out.println(~12);
        int x=0;
            do {
                if (x<5)continue;
                System.out.println(x);
                //System.out.println(x);

            }while (x++<10);
            /*
            5 6 7 8 9 10
             */

    }
}
