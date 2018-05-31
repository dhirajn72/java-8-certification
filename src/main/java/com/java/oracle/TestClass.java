/*
 * All Rights Reserved @Dhiraj
 */

package com.java.oracle;

/**
 * @author Dhiraj
 * @date 31/05/18
 */
public class TestClass {
    public static void main(String[] args) {
        print(new FancyCar());

    }

    static public void print(Car car){
        //((Breakable)car).breakSmoothly();// CCE at RunTime
        //((FancyCar)car).breakSmoothly();
        //((FancyCar)car).accelerate();
        //((SuperFancyCar)car).accelerate();//CCE at RunTime
        //((SuperFancyCar)car).turn(); //CCE at RunTime

        car.accelerate();
        //car.turn; //Won't compile
    }

}

interface  Breakable{
    public void breakSmoothly();
}
class Car{
    public  void accelerate(){
        System.out.println("Car-accelerate()");
    }
}
class FancyCar extends Car{
    public void breakSmoothly(){
        System.out.println("FancyCar-breakSmoothly()");
    }
}
class SuperFancyCar extends FancyCar implements Breakable{
    public void breakSmoothly() {
        System.out.println("SuperFancyCar-breakSmoothly()");
    }
    public void turn(){
        System.out.println("SuperFancyCar-turn()");
    }
}