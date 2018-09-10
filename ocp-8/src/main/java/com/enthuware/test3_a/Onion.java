/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware.test3_a;

/**
 * @author Dhiraj
 * @date 01/09/18
 */

public class Onion {
    private String data = "skin";

    private class Layer extends Onion {
        String data = "thegoodpart";
        public String getData() {
            return data;
        }
    }

    public String getData() {
        return new Layer().getData();
    }

    public static void main(String[] args) {
        Onion o = new Onion();
        System.out.println(o.getData());
    }
}