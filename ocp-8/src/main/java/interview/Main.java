/*
 * All Rights Reserved @Dhiraj
 */

package interview;

/**
 * @author Dhiraj
 * @date 06/04/19
 */
abstract class Test {
    int a=90;
    public void m1(){
        System.out.println("m1()");
    }
    public void m2(){
        System.out.println("m2()");
    }

    public abstract void m3();
}

public class Main extends Test{
    public static void main(String[] args) {
        Main m= new Main();
        m.m3();
    }

    @Override
    public void m3() {
        System.out.println("m3()");
    }
}
