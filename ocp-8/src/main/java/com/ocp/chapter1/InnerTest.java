/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter1;

/**
 * @author Dhiraj
 * @date 03/07/18
 */
public class InnerTest {

    public static void main(String[] args) {
        InnerTest_A.InnerTest_B.InnerTest_C c= new InnerTest_A().new InnerTest_B().new InnerTest_C();
        c.print();
    }

}


class InnerTest_A{
    private int x=10;

    class InnerTest_B{
        private int x=100;

        class InnerTest_C{
            private int x=1000;
            public void print(){
                System.out.println(x);
                System.out.println(this.x);
                System.out.println(InnerTest_B.this.x);
                System.out.println(InnerTest_A.this.x);
            }

        }
    }
}


//class InnerTest_D implements InnerTest_D.InnerInterface{
class InnerTest_D{
    private interface InnerInterface{

    }
}