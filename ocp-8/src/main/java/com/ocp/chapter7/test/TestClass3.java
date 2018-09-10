/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter7.test;

import java.util.Arrays;

/**
 * @author Dhiraj
 * @date 30/08/18
 */
public class TestClass3 {
    public static void main(String[] args) {
        /*System.out.println(Arrays.asList("duck","chicken","flamingo","pelican").parallelStream().parallel()
                .reduce(0,(c1,c2)->c1.length()+c2.length(),(s1,s2)->s1+s2));*/
        System.out.println(Arrays.asList("duck", "chicken", "flamingo", "pelican")./*stream()*/parallelStream().parallel()
                .reduce("", (c1, c2) -> c1.length() + c2.length() + "",
                        (s1, s2) ->{ System.out.println("s1="+s1+":"+"s2="+s2);return s1 +":"+ s2;}));

        /*System.out.println(Arrays.asList(1,2,3,4,5).*//*stream()*//*parallelStream().parallel()
                .reduce(1, (c1, c2) -> c1 + c2,
                        (s1, s2) ->{ System.out.println("s1="+s1+":"+"s2="+s2);return s1+s2;}));*/






    }
}
