/*
 * All Rights Reserved @Dhiraj
 */

package com.java.lambda;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Dhiraj
 * @date 08/06/18
 */
public class Test {
    public static void main(String[] args) {
        ArrayList<Long> longs= new ArrayList<>();
        longs.add(new Long(1));
        longs.add(2L);
        longs.add(new Long("3"));
        longs.add(4L);
        longs.remove(2);
        System.out.println(longs);

    }
}
