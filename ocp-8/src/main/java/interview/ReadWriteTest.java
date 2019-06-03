/*
 * All Rights Reserved @Dhiraj
 */

package interview;

import java.util.ArrayList;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @author Dhiraj
 * @date 06/05/19
 */
public class ReadWriteTest {
    static final ReadWriteTest obj = new ReadWriteTest();
    private final ArrayList<Integer> theList = new ArrayList<>();
    static ReadWriteLock r = new ReentrantReadWriteLock();
    int data = 0;

    public static void main(String[] args) {

        ReadThread r=new ReadThread();
        WriteThread w= new WriteThread();
        Thread read=new Thread(r);
        Thread write=new Thread(w);
        read.start();
        write.start();
    }

    public void read() {
        System.out.println("reading");
        theList.forEach(e->{System.out.print(e+" ");});
    }

    public void write(int data) {
        System.out.println("Written " + data);
        theList.add(data);
    }

    static class ReadThread implements Runnable {
        @Override
        public void run() {
            r.readLock().lock();
            try {
                for (int i=0;i<10;i++) {
                    obj.read();
                }
            } finally {
                r.readLock().unlock();
            }
        }
    }

    static class WriteThread implements Runnable {
        @Override
        public void run() {
            r.writeLock().lock();
            try {
                for (int i=0;i<10;i++) {
                    obj.write(i);
                }
            } finally {
                r.writeLock().unlock();
            }
        }
    }

}
