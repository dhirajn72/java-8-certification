/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter6;

/**
 * @author Dhiraj
 * @date 16/09/18
 */
public class TestClass12 implements AutoCloseable{

    @Override
    public void close() throws Exception {
        System.out.println("close()");
        throw  new Exception("close!!");
    }

    public static void main(String[] args) {
        try(TestClass12 class12 =  new TestClass12()) {
            System.out.println("try");
            throw  new RuntimeException();
        }
        catch (Exception e){
            System.out.println("Exception");
            e.printStackTrace();
            //System.out.println(e.getMessage());
            //e.getSuppressed();
        }
    }
}
