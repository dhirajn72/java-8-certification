/*
 * All Rights Reserved @Dhiraj
 */

package com.java.misc;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Dhiraj
 * @date 19/09/19
 */
public class TestIds {
    public static void main(String[] args) {
        Set<Long> sets=new HashSet<>();
        sets.add(1l);
        sets.add(2l);

        String arrayIds=sets.toArray().toString();
        String ids=getIds(sets);
        System.out.println(arrayIds);
    }

    private static String getIds(Set<Long> sets) {
        StringBuilder sb=new StringBuilder();
        sets.forEach(id->sb.append(id).append(","));
        return sb.length()>1 ? sb.deleteCharAt(sb.length()-1).toString():"";
    }
}
