/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware.test4;

import java.util.Arrays;
import java.util.List;

/**
 * @author Dhiraj
 * @date 25/08/18
 */

class MyProcessor{
    Integer value;
    public MyProcessor(Integer value){
        this.value = value;
    }
    public void process(){
        System.out.println(value+" ");
    }
}
public class TestClass5 {
    public static void main(String[] args) {
        List<Integer> ls = Arrays.asList(1, 2, 3);
        ls.stream().map(MyProcessor::new).forEach(MyProcessor::process);

    }
}