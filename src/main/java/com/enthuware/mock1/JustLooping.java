/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware.mock1;

/**
 * @author Dhiraj
 * @date 27/05/18
 */

public class JustLooping {
    private int j;

    public static void main(String[] args) {
        new JustLooping().showJ();
    }

    void showJ() {
        while (j <= 5) {
            for (int j = 1; j <= 5; ) {
                System.out.print(j + " ");
                j++;
            }
            j++;
        }
    }
}
