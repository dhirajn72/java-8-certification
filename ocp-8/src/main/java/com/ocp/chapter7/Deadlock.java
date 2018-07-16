/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter7;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Dhiraj
 * @date 15/07/18
 */
public class Deadlock {

    public static void main(String[] args) {
        ExecutorService service=null;
        try {
            Deadlock testClass18a= new Deadlock();
            Deadlock testClass18b= new Deadlock();

            Food food= new Food();
            Water water= new Water();

            service= Executors.newFixedThreadPool(10);
            service.submit(()->testClass18a.eatAndDrink(food,water));
            //service.submit(()->testClass18b.drinkAndEat(water,food));
            service.submit(()->testClass18a.drinkAndEat(water,food));
        }finally {
            if (service!=null)service.shutdown();
        }
    }
    public void eatAndDrink(Food food,Water water){
        synchronized (food){
            System.out.println("Got Food !!");
            move();
            synchronized (water){
                System.out.println("Got water******");
            }
        }
    }
    public void drinkAndEat(Water water,Food food){
        synchronized (water){
            System.out.println("Got Water !!");
            move();
            synchronized (food){
                System.out.println("Got Food *******");
            }
        }
    }
    private void move() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
class Food{}
class Water{}