/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware.test3;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @author Dhiraj
 * @date 20/08/18
 */
public class TestClass10 {

    private final ArrayList<String> theList = new ArrayList<String>();
    //Note that ReadWriteLock is an interface.
    private final ReadWriteLock rwl = new ReentrantReadWriteLock();
    private final Lock r = rwl.readLock();
    private final Lock w = rwl.writeLock();

    public String read(){
        r.lock();
        try{
            System.out.println("reading");
            if(theList.isEmpty()) return null;
            else return theList.get(0);
        }finally{
            r.unlock();
        }
    }

    public void write(String data){
        w.lock();
        try{
            System.out.println("Written "+data);
            theList.add(data);
        }finally{
            w.unlock();
        }
    }


    public static void main(String[] args) {
        ExecutorService service= Executors.newFixedThreadPool(5);
        TestClass10 obj=new TestClass10();
        int i=10;
            service.submit(()->{
                obj.read();
                obj.write(String.valueOf(i));});



    }
}
