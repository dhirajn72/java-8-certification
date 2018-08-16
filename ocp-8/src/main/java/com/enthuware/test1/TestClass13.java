/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware.test1;

/**
 * @author Dhiraj
 * @date 15/08/18
 */
public class TestClass13 {
    public static void main(String[] args) throws Exception {
        try (Inter i = new Inter()) {
            //System.out.println("try");
            throw new Exception("inter");
        }
    }
}
class Inter implements AutoCloseable {
    @Override
    public void close() {
        //System.out.println("close()");
        throw new RuntimeException("rte");
    }
}