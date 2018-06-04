/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware.mock3;

/**
 * @author Dhiraj
 * @date 04/06/18
 */

interface Pow {
    static void wow() {
        System.out.println("In Pow.wow");
    }
}

abstract class Wow {
    static void wow() {
        System.out.println("In Wow.wow");
    }
}

public class Powwow extends Wow implements Pow {
    public static void main(String[] args) {
        Powwow f = new Powwow();
        f.wow();
    }
}