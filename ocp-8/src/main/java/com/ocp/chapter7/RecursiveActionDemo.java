/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter7;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

/**
 * @author Dhiraj
 * @date 17/09/18
 */
public class RecursiveActionDemo {
    public static void main(String[] args) {
        ForkJoinPool pool = new ForkJoinPool();
        int[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Square app = new Square(data, 0, data.length);
        pool.invoke(app);
        System.out.println(app.result);
    }
}

class Square extends RecursiveAction {
    //keep static
    static int result;
    final int LIMIT = 3;
    int start, end;
    int[] data;

    Square(int[] data, int start, int end) {
        this.start = start;
        this.end = end;
        this.data = data;
    }

    @Override
    protected void compute() {
        if ((end - start) < LIMIT) {
            for (int i = start; i < end; i++) {
                //result += data[i] * data[i];
                result +=  data[i];

            }
        } else {
            int mid = (start + end) / 2;
            Square left = new Square(data, start, mid);
            Square right = new Square(data, mid, end);
            left.fork();
            right.fork();
            left.join();
            right.join();
        }
    }
}
