/*
 * All Rights Reserved @Dhiraj
 */

package com.java.core;

/**
 * @author Dhiraj
 * @date 13/05/18
 */
public class Telescope {
    static  int magnify=2;

    public static void main(String[] args) {
        go();
    }

    static void go() {
        int magnify=3;
        zoomIn();
    }

    static void zoomIn() {
        magnify *= 5;
        zoomMore(magnify);
        System.out.println(magnify);
    }

    static void zoomMore(int magnify) {
        magnify *= 7;
    }
}
