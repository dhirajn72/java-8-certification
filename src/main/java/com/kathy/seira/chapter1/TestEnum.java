/*
 * All Rights Reserved @Dhiraj
 */

package com.kathy.seira.chapter1;

/**
 * @author Dhiraj
 * @date 16/06/18
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
    public static void main(String[] args) {
       // System.out.println(a.DOG.sound + " " + a.FISH.sound);
        //System.out.println(Animals.DOG.sound + " " + Animals.FISH.sound);
    }
}