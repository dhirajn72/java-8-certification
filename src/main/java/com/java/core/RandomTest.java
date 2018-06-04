/*
 * All Rights Reserved @Dhiraj
 */

package com.java.core;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Dhiraj
 * @date 01/06/18
 */
public class RandomTest {
    public static void main(String[] args) {
        Random random=(x)->{return Math.random()*x;};
        List<Double> lessThanOrEqualsHalf=new ArrayList<>();
        List<Double> greaterThanHalf=new ArrayList<>();
        for (int i=0;i<100;i++){
            double x=random.generateRandom(1);
            if (x<0.5)
                lessThanOrEqualsHalf.add(x);
            else
                greaterThanHalf.add(x);
        }
//        System.out.println("Less that half::");
//        lessThanOrEqualsHalf.forEach(x-> System.out.println(x));
//        System.out.println("***********************\nGreater than half::");
//        greaterThanHalf.forEach(x-> System.out.println(x));
        String name = new String[] {"Fluffy", "Fido",
                "Rover", "Spike",
                "Gigi"}[2];
        List<String> strings= new ArrayList<>();
        strings.add("zeplin");
        strings.add("parrot");
        strings.add("Dog");
        strings.add("ox");
        strings.add("bull");
        strings.forEach(System.out::println);
        System.out.println("*******");
        strings.forEach(x-> System.out.println(x));
        //new TestCons().loop(); //Stack Overflow Error
        try {
            new TestCons().loop();
        }catch (Error e){
            System.out.println(e);
        }
    }
}


@FunctionalInterface
interface Random{
    double generateRandom(int x);
}
class TestCons{
    /*TestCons(){
        this(3);

    }
    TestCons(int x){
        this();
    }*/

    int x=0;
    void loop(){
       // System.out.println(x);
       // x++;
        loop();
    }

}