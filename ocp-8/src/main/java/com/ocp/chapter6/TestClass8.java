/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter6;

@FunctionalInterface
interface PrintSuppressed {
    Throwable print(Throwable t);
}

/**
 * @author Dhiraj
 * @date 31/07/18
 */
public class TestClass8 {
    public static void main(String[] args) {

        try (JammedTurkey jammedTurkey1 = new JammedTurkey(1);
             JammedTurkey jammedTurkey2 = new JammedTurkey(2)) {
            throw new IllegalStateException("proble inside try!!!");
        } /*catch (Exception_1 e) {
            Throwable[] throwables = e.getSuppressed();
            PrintSuppressed printSuppressed = (x) ->{
                System.out.println(x.getCause()); return x.getCause();};

            for (Throwable t : throwables) {
                printSuppressed.print(t);
            }

        }*/
    }
}

class JammedTurkey implements AutoCloseable {
    int val;
    @Override
    public void close() {
        //throw  new IllegalStateException("turkeys are  jammed");
        throw new RuntimeException("turkeys are  jammed::"+val);


    }

    public JammedTurkey(int val) {
        this.val=val;
    }
}