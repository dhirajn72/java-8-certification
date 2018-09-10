/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware.test3_a;

import java.time.ZoneId;

/**
 * @author Dhiraj
 * @date 02/09/18
 */
public class TestClass18 {
    public static void main(String[] args) {
        ZoneId.getAvailableZoneIds().stream().filter(x->x.contains("US") || x.contains("America")).forEach(System.out::println);
    }
}
