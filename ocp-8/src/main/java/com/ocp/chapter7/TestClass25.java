/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter7;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Dhiraj
 * @date 03/08/18
 */
public class TestClass25 {
    public static void main(String[] args) {
        TestClass25 ob= new TestClass25();

        List<Integer> data=new ArrayList<>();
        for (int i=0;i<200;i++)data.add(i);

        long start=System.currentTimeMillis();
        ob.processAllData(data);
        double time=(System.currentTimeMillis()-start)/1000;
        System.out.println("Task completed in ::"+time);
    }

    public int processRecords(int input){
        try {
            Thread.sleep(10);
        }catch (InterruptedException e){}
        return input+1;
    }

    public void processAllData(List<Integer> data){
        /*data.stream().map(a->{int res=processRecords(a);
        System.out.println(res);return res;}).count();*/
        data.parallelStream().map(a->{int res=processRecords(a);
            System.out.println(res);return res;}).count();

    }
}
