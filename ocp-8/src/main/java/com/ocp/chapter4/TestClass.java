/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter4;

import com.ocp.utils.ListUtils;

import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Supplier;
import java.util.stream.Collectors;

/**
 * @author Dhiraj
 * @date 07/07/18
 */
public class TestClass {
    public static void main(String[] args) {
        Supplier<String> stringSupplier = String::new;
        //System.out.println(stringSupplier.get().equals(stringSupplier.get()));
        System.out.println(stringSupplier.get() == "");
        System.out.println(stringSupplier.toString());
        System.out.println(stringSupplier.get() == stringSupplier.get());
        System.out.println(new String().toString());
        //Supplier<LocalDate> localDateSupplier=LocalDate::now; //Valid
        Supplier<LocalDate> localDateSupplier = () -> LocalDate.now();

        System.out.println(localDateSupplier.get());
        System.out.println(localDateSupplier.get() == localDateSupplier.get());
        System.out.println(stringSupplier.get());

        Map<Integer, String> map = ListUtils.getMapObject();
        System.out.println(map);
        Map<Integer,String> map1= map.entrySet().stream().sorted(Map.Entry.<Integer, String>comparingByValue().reversed())
                                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(x,y)->x, LinkedHashMap::new));
        System.out.println(map1);
    }
}
