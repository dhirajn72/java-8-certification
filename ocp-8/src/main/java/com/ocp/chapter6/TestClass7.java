/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter6;

import com.ocp.chapter3.TestClass6;

import java.io.Closeable;
import java.io.IOException;
import java.sql.SQLException;

/**
 * @author Dhiraj
 * @date 12/07/18
 */
public class TestClass7 {

    public static void main(String[] args) {
        try{
            new TestClass7().m1();
        }
        catch (IllegalStateException e){
            System.out.println(e);
            for (Throwable t:e.getSuppressed())
                System.out.println(t);
        }


    }

    public void m1(){
        try(TestExceptions t=new TestExceptions()) {
            throw new IllegalArgumentException("inside try");
        }
        catch (IllegalArgumentException e){
            System.out.println(e);
            e.printStackTrace();

        }catch (RuntimeException e){
            //System.out.println(e);
            e.printStackTrace();

        }
        catch (Exception e){
            System.out.println(e);

        }
        /*finally {
            System.out.println("finally executes");
            throw new IllegalStateException("finaly throws");
        }*/
    }

}
class TestExceptions implements Closeable{
    @Override
    public void close() throws IOException {
        throw new IOException("close");
    }
}
/*
class TestExceptions implements AutoCloseable{
    @Override
    public void close() throws ArrayIndexOutOfBoundsException {
        throw new ArrayIndexOutOfBoundsException("close");
    }
}*/
