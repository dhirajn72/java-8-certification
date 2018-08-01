/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter5;

import java.time.ZoneId;

/**
 * @author Dhiraj
 * @date 29/07/18
 */
public class TestClass4 {
    public static void main(String[] args) {
        System.out.println(ZoneId.systemDefault());

        //ZoneId.getAvailableZoneIds().stream().filter(x->x.contains("Kol")).sorted().forEach(System.out::println);

        ZoneId.getAvailableZoneIds().stream().filter(x->x.contains("Asia")).sorted().forEach(System.out::println);


    }
}
