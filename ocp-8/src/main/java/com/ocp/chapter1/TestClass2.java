/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter1;

/**
 * @author Dhiraj
 * @date 03/07/18
 */
public class TestClass2 {
    public static void main(String[] args) {
        //TestClass2A.TestClass2B testClass2B= new TestClass2A.TestClass2B();
        //System.out.println(testClass2B.a);
       // System.out.println(TestClass2A.TestClass2B.a);
        TestClass2A.TestClass2B testClass2B= new TestClass2A().new TestClass2B();
        System.out.println(testClass2B);







    }
}

class TestClass2A{
     class TestClass2B{
          int a;

    }
    /*static class TestClass2B{
        static int a;

    }*/

    TestClass2A(){
         class TestClass2B{
             int a;

        }
    }


    public void showOff(){
        //TestClass2A.TestClass2B testClass2B=new  TestClass2A().new TestClass2B(); //Fixme!
    }



}

