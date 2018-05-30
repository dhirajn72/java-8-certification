package com.java.core;

import java.io.IOException;

/**
 * @author Dhiraj
 * @date 24/05/18
 */


class Infinity {
}

public class Beyond extends Infinity {
    static Integer i;

    public static void main(String[] args) {
        int sw = (int) (Math.random() * 3);
        switch (sw) {
            case 0: {
                for (int x = 10; x > 5; x++)
                    if (x > 10000000) x = 10;
                break;
            }
            case 1:{int y = 7 * i;  break;  }
            case 2:{Infinity infinity=new Beyond();
                    Beyond b=(Beyond)infinity;
            }
        }
    }

    public void m1() throws IOException{
        try {
            throw new IOException();
        }catch (Exception e){
            throw e;
        }
    }
}
