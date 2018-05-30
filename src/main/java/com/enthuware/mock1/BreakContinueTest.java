/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware.mock1;

/**
 * @author Dhiraj
 * @date 28/05/18
 */
public class BreakContinueTest {
    public static void main(String[] args) {
        int x=0;
        if (x==0){
            for (int i=0;i<10;i++){
                if (i==4)
                    //break;
                    continue; // break, continue can always be used in loop.
            }
            switch (x){
                case 3:break;// continue can't be used in switch
            }
        }

        foo:
        //{
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 9; j++) {
                    if (j == 5)
                        //break foo;
                        continue foo; // Compile time error, if foo has {}
                }
                System.out.println("j is 5");
            }
            System.out.println("Broke foo,j is 5");
        //}

        // TODO! If an insert() attempts to start at an index after the StringBuilder's current length, an exception will be thrown.
    }
}
