/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter9;

/**
 * @author Dhiraj
 * @date 10/09/18
 */
public class Deadlock {

    static Object ob1= new Object();
    static Object ob2 = new Object();

    public static void main(String[] args) {

        new Thread(()->{
            synchronized (ob1){
                System.out.println("Locked ob1 ->first thread");
                sleep();
                synchronized (ob2){
                    System.out.println("Locked ob2->first thread");
                }
            }
        }).start();
        new Thread(()->{
            synchronized (ob2){
                System.out.println("Locked Ob2->second thread");
                sleep();
                synchronized (ob1){
                    System.out.println("Locked Ob1->Second thread");
                }
            }
        }).start();
    }
    private static void sleep() {
        try {
            Thread.sleep(400);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
