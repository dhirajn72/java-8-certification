/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Dhiraj
 * @date 22/07/18
 */
public class TestClass5 {
    public static void main(String[] args) {
        List<String> strings= new ArrayList<>();
        strings.add("a");
        strings.add("b");
        strings.add("c");
        System.out.println(strings);
        Immutable immutable= new Immutable(strings);
        List<String> strings1=immutable.getStrings();
        strings1.add("d");
        System.out.println(strings1);
        System.out.println(strings.hashCode());
        System.out.println(strings1.hashCode());


    }
}


final class Immutable{
    private final List<String> strings;

    public Immutable(List<String> strings){
        if (strings==null)
            throw new IllegalStateException("Arguments not valid");
        this.strings=new ArrayList<>(strings);
        //this.strings=strings;

    }

    public List<String> getStrings() {
        //return strings;
        //return Collections.unmodifiableList(strings);
        return new ArrayList<>(this.strings);
    }
}