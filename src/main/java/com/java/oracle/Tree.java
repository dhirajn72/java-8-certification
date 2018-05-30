/*
 * All Rights Reserved @Dhiraj
 */

package com.java.oracle;

/**
 * @author Dhiraj
 * @date 23/05/18
 */


interface Vessel {
}

interface Toy {
}

class Boat implements Vessel {
}

class Speedboat extends Boat implements Toy {
}

public class Tree {
    public static void main(String[] args) {
        String s = "0";
        Boat b = new Boat();
        Boat b2 = new Speedboat();
        Speedboat s2 = new Speedboat();
        if ((b instanceof Vessel) && (b2 instanceof Toy)) s += "1";
        if ((s2 instanceof Vessel) && (s2 instanceof Toy)) s += "2";
        System.out.println(s);

        int i=0,y=0;
        for (i=0;i<10;y=getIt() ){
            System.out.println(i+"   "+ y);
            i++;

        }

    }

    private static int getIt() {
        System.out.println(6);
        return 6;
    }
}