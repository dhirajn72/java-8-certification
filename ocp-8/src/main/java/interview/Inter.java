/*
 * All Rights Reserved @Dhiraj
 */

package interview;

/**
 * @author Dhiraj
 * @date 31/03/19
 */
public class Inter {
}
interface Inter1{
    static void m1(){
        System.out.println("m1-Inter1");
    }
    default void m2(){
        System.out.println("m2-Inter1");
    }
}
interface Inter2{
    static void m2(){
        System.out.println("m2-Inter2");
    }
    default void m1(){
        System.out.println("m1-Inter2");
    }
}

class InterTest implements Inter1,Inter2{

    public void doStuff(){
        Inter1.m1(); //m1-Inter1
        Inter1.super.m2(); //m2-Inter1
        this.m2(); //m2-Inter1
        this.m1(); //m1-Inter2
    }
    public static void main(String[] args) {
        InterTest t= new InterTest();
        t.doStuff();

    }
}