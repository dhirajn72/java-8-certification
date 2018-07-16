/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter4;

import java.time.LocalDate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * @author Dhiraj
 * @date 07/07/18
 */
public class TestClass {
    public static void main(String[] args) {
        Supplier<String> stringSupplier=String::new;
        //System.out.println(stringSupplier.get().equals(stringSupplier.get()));
        System.out.println(stringSupplier.get()=="");
        System.out.println(stringSupplier.toString());
        System.out.println(stringSupplier.get()==stringSupplier.get());
        System.out.println(new String().toString());
        //Supplier<LocalDate> localDateSupplier=LocalDate::now; //Valid
        Supplier<LocalDate> localDateSupplier=()->LocalDate.now();

        System.out.println(localDateSupplier.get());
        System.out.println(localDateSupplier.get()==localDateSupplier.get());
        System.out.println(stringSupplier.get());
    }
}
