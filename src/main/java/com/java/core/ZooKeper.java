/*
 * All Rights Reserved @Dhiraj
 *
 */

package com.java.core;

/**
 * @author Dhiraj
 * @date 12/05/18
 */

class Mamal{
    String name="furry";
    String makeNoise(){
        return "generic noise";
    }
}
class Zebra extends Mamal{
    String name="stripes";
    String makeNoise(){
        return "bray";
    }
}
public class ZooKeper {
    public static void main(String[] args) {
        new ZooKeper().go();
    }

    void go(){
        Mamal m= new Zebra();
        System.out.println(m.name+" "+m.makeNoise());
    }
}
