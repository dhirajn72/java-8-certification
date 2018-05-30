/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware.mock1;

import com.java.core.Animal;

/**
 * @author Dhiraj
 * @date 29/05/18
 */
enum Animals {
    DOG("woof"), CAT("meow"), FISH("burble");
    String sound;

    Animals(String s) {
        sound = s;
    }
}

class TestEnum {
    static Animals a;
    /*enum Animals {
        DOG("woof"), CAT("meow"), FISH("burble");
        String sound;

        Animals(String s) {
            sound = s;
        }
    }*/

    public static void main(String[] args) {
        System.out.println(a.DOG.sound + " " + a.FISH.sound);
        //System.out.println(Animals.DOG.sound + " " + Animals.FISH.sound);
        //System.out.println(Animals.values());
    }
}