/*
 * All Rights Reserved @Dhiraj
 */

package interview;

import java.util.*;

/**
 * @author Dhiraj
 * @date 14/03/19
 */
public class Test1 {


    /*

    int[] arr={5,2,7,5,3,7,5};

    Output: 2+3=5

     */

    public static void main(String[] args) {
        int[] arr={5,2,7,5,3,7,5}; // {2,3,5,5,5,7,7}

        List<Integer> integers= new ArrayList<>();

        /*for(int i=0;i<arr.length-1;i++){
            int count=0;
            for (int j=0;j<arr.length;j++){
                if ( arr[i]==arr[j] ){
                    count++;
                }
            }
            if (count==1)
                integers.add(arr[i]);
        }
        int sum=0;
        for (int x:integers){
            sum+=x;
        }
        System.out.println(sum);
        */

        //mergeSort(arr); //will give sorted array


        int sum = 0;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i]!=arr[i+1]) {
                sum=sum+arr[i];
            }
        }

        System.out.println(sum);
    }










}
