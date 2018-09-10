/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware.test3_a;

import java.net.URI;
import java.nio.file.Paths;
import java.time.Duration;
import java.time.Period;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author Dhiraj
 * @date 01/09/18
 */

public class Test {
    public static void main(String[] args) throws Exception {
        /*FileWriter fw = new FileWriter("text.txt");
        // fw.write("hello"); //1
        fw.close();*/

        //Duration d = Duration.ofSeconds(250);
        Duration d = Duration.ofMinutes(250);
        //Duration d = Duration.ofHours(250);

        System.out.println(d);
        Period p = Period.ofDays(1);
        System.out.println(p);


        List<String> s1 = Arrays.asList("OCAJP", "Java", "OCPJP", "Java", "C#", "C#", "OCEJPA", "Java");

        s1.stream()
                .collect(Collectors.groupingBy(c -> c.length()))
                .forEach((m, n) -> System.out.println(m+":"+n));

        //System.out.println(Paths.get(new URI("file://test.txt")));

        List<String> s2 = Arrays.asList("OCAJP", "Java", "OCPJP", "Java", "C#", "C#", "OCEJPA", "Java");
        Map<String,Integer> stringIntegerMap=s2.stream().collect(Collectors.toMap(x->x, y->y.length(),(x,y)->y));
        System.out.println(stringIntegerMap);


    }
}