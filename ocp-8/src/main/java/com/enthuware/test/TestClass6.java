/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

/**
 * @author Dhiraj
 * @date 11/08/18
 */

class Address implements Comparable<Address>{
    String street;
    String zip;
    public Address(String street, String zip){
        this.street = street; this.zip = zip;
    }
    public int compareTo(Address o) {
        int x = this.zip.compareTo(o.zip);
        return x == 0? this.street.compareTo(o.street) : x;
    }
}
public class TestClass6 {
    public static void main(String[] args) {
        ArrayList<Address> al = new ArrayList<>();
        al.add(new Address("dupont dr", "28217"));
        al.add(new Address("sharview cir", "28217"));
        al.add(new Address("yorkmont ridge ln", "11223"));
        Collections.sort(al);
        for(Address a : al) System.out.println(a.street+" "+ a.zip);
        System.out.println("*****");

        Stack<String> strings= new Stack<>();
        strings.push("a");
        strings.add("b");
        strings.add("c");
        strings.push("d");
        System.out.println(strings);
        strings.forEach(x-> System.out.println(x));
    }
}