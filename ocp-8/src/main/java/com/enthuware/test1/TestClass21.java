/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware.test1;

import java.text.DateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Dhiraj
 * @date 07/09/18
 */
public class TestClass21 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Peter", "Paul", "Pascal");
        Optional<String> ops = names.stream()
                .parallel()
                //.allMatch(name->name!=null)
                .filter(name -> name.length() > 6)
                .findAny();
        System.out.println(ops);
        Date d = new Date();
        DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT);
        //df.setLocale(new Locale("fr", "FR"));
        String s = df.format(d);//
        System.out.println(s);


        Stream<String> ss = Stream.of("a", "b", "c");
        //String str = ss.collect(Collectors.joining());
        //String str = ss.collect(Collectors.joining("X"));
        String str = ss.parallel().collect(Collectors.joining(",", "-", "+"));

        System.out.println(str);


    }
}
