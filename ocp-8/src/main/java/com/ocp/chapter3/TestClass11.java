/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter3;

import java.util.List;
import java.util.ArrayList;
import java.util.Set;

/**
 * @author Dhiraj
 * @date 24/07/18
 */
public class TestClass11 {
    public static void main(String[] args) {

        /**
         *
         * Case 1: Cannot Instantiate Generic Types with Primitive Types
         */
       // Pair<int, char> p = new Pair<>(8, 'a');  // compile-time error


        /**
         *
         * Case 2: Cannot Create Arrays of Parameterized Types
         */

        //List<Integer>[] arrayOfLists = new List<Integer>[2];  // compile-time error

        Object[] strings = new String[2];
        strings[0] = "hi";   // OK
        strings[1] = 100;    // An ArrayStoreException is thrown.

        /*Object[] stringLists = new List<String>[];  // compiler error, but pretend it's allowed
        stringLists[0] = new ArrayList<String>();     // OK
        stringLists[1] = new ArrayList<Integer>();    // An ArrayStoreException should be thrown,
        */

    }

    public static <T,E> int count(T[] anArray, T elem,E e1) {
        int cnt = 0;
        for (T e : anArray)
            if (e.equals(elem))
                ++cnt;
        return cnt;
    }
    public  <Integer,String> int countIt(Integer[] anArray, Integer elem,String e1,Double d) {
        int cnt = 0;
        for (Integer e : anArray)
            if (e.equals(elem))
                ++cnt;
        return cnt;
    }
    public  <Integer,String> int countIt(Double[] anArray, Double elem,int e1,Double d) {
        int cnt = 0;
        for (Double e : anArray)
            if (e.equals(elem))
                ++cnt;
        return cnt;
    }

    /**
     *
     * Case 3:     Cannot Overload a Method Where the Formal Parameter Types of Each Overload Erase to the Same Raw Type
     *
     */

   /*class Example {
        public void print(Set<String> strSet) { }
        public void print(Set<Integer> intSet) { }
    }

    class ExampleSub extends Example{
        public void print(Set<Integer> strSet) { }

    }*/


    /**
     *
     * Case 4: Cannot Create Instances of Type Parameters

     *
     * @param list
     * @param <E>
     */
    public <E> void doIt(List<E> list){
        //E e=new E();                  // Not Allowed in generics
        //list.add(e);
    }

    /**
     *   Case 5:Cannot Use Casts or instanceof with Parameterized Types
     */
    /*public static <E> void rtti(List<E> list) {
        if (list instanceof ArrayList<Integer>) {  // compile-time error
            // ...
        }
    }*/


    public static <T extends Shape> void draw(T t) {
        /* ... */
    }

    /*public static <T super Rectangle > void drawIt(T t) {
        *//* ... *//*
    }*/


}



class Shape { /* ... */ }
class Circle extends Shape { /* ... */ }
class Rectangle extends Shape { /* ... */ }




class Pair<K, V> {

    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    // ...
}


/**
 *
 * Case 6: Cannot Declare Static Fields Whose Types are Type Parameters
 */

/*class MobileDevice<T> {
    private static T os;

    // ...
}*/
/*
If static fields of type parameters were allowed, then the following code would be confused:

        MobileDevice<Smartphone> phone = new MobileDevice<>();
        MobileDevice<Pager> pager = new MobileDevice<>();
        MobileDevice<TabletPC> pc = new MobileDevice<>();
*/


/**
 *
 * Case 7: Cannot Create, Catch, or Throw Objects of Parameterized Types
 * @param <T>
 */

/*class BadException<T> extends Exception_1{

}*/
