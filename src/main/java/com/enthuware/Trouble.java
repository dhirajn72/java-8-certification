/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware;

/**
 * @author Dhiraj
 * @date 30/05/18
 */
public class Trouble {

    Float f = null;
    public  void m1() {
        try
        {
            f = Float.valueOf("12.3");
            String s = f.toString();
            int i = Integer.parseInt(s);
            System.out.println("" + i);
        }
        catch(Exception e){
            System.out.println("trouble : " + f);
        }
    }

    public static void main(String[] args) {
        new Trouble().m1();

    }
}
