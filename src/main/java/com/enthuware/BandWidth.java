/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware;

/**
 * @author Dhiraj
 * @date 30/05/18
 */

public class BandWidth {
    public int available = 0;

    public BandWidth(int quota) {
        this.available = quota;
    }

    public int getAvailable() {
        return available;
    }

    public void addMore(int more) {
        available += more;
    }


    public static void main(String[] args) {
        BandWidth bw = new BandWidth(100);
        System.out.println(bw.getAvailable());

        System.out.println(new StringBuilder("hello")+" world");


    }
}


