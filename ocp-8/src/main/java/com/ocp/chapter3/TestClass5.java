/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * @author Dhiraj
 * @date 07/07/18
 */
public class TestClass5 {
    public static void main(String[] args) {
        Duck d1= new Duck(50,"TestClass1");
        Duck d2= new Duck(20,"D");
        List<Duck> ducks= new ArrayList<>();
        ducks.add(d1);
        ducks.add(d2);

//        Comparator<Duck> duckComparator= (d3,d4) -> DuckHelper.compareByName(d3,d4);
//        Comparator<Duck> duckComparator= (d3,d4) -> DuckHelper.compareByWeight(d3,d4);
        Comparator<Duck> duckComparator= DuckHelper::compareByWeight;

        System.out.println(ducks);
        Collections.sort(ducks,duckComparator);
        System.out.println(ducks);
        //Consumer<ArrayList> list =ArrayList::new;
        //list.accept(new ArrayList());
        Supplier<ArrayList> list =ArrayList::new;
        //ArrayList arrayList=list.get();
        //System.out.println(arrayList);



    }
}
