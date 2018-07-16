/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter6;

/**
 * @author Dhiraj
 * @date 11/07/18
 */
public class TestClass3 {
    public static void main(String[] args) {


        try(Test t= new Test()) {
            System.out.println("try");
        }
        catch (Exception e){
            e.printStackTrace();
            //System.out.println(e);
        }
    }
}

class Test implements AutoCloseable{

    @Override
    public void close() throws Exception {
        System.out.println("close");
        //throw new IllegalStateException("close throws");
        throw new Exception("close throws");

    }
}