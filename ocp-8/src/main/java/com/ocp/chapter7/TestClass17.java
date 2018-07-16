/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter7;

/**
 * @author Dhiraj
 * @date 15/07/18
 */
public class TestClass17 {

    private static Object ob1=new Object();
    private static Object ob2= new Object();

    public static void main(String[] args) {
        new Thread(new Thread1()).start();
        new Thread(new Thread2()).start();
    }


    static class Thread1 implements Runnable{
        @Override
        public void run() {

            synchronized (ob1){
                System.out.println("Got ob1!");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (ob2){
                    System.out.println("waiting for ob2 !!");
                }
            }
        }
    }

    static class Thread2 implements Runnable{
        @Override
        public void run() {
            synchronized (ob2){
                System.out.println("Got ob2!!");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (ob1){
                    System.out.println("waiting for ob1 !!");
                }
            }
        }
    }
}
