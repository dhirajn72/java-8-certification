/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter5;

import java.util.Arrays;
import java.util.Locale;
import java.util.Properties;
import java.util.ResourceBundle;
import java.util.function.Consumer;

/**
 * @author Dhiraj
 * @date 10/07/18
 */
public class TestClass7 {
    public static void main(String[] args) {
        Consumer consumer = System.out::println;
        Locale in = new Locale("hi", "IN");
        //ResourceBundle bundle=ResourceBundle.getBundle("zoo",in);
        ResourceBundle bundle = ResourceBundle.getBundle("com.ocp.chapter5.zoo", in);

        consumer.accept(bundle);
        consumer.accept(bundle.getString("hi"));
        bundle.getKeys();
        bundle.keySet();
        Properties properties = new Properties();
        consumer.accept(properties);
        bundle.keySet().stream().forEach(x -> properties.put(x, bundle.getString(x)));
        consumer.accept(properties);
        consumer.accept(properties.get("hi"));

        Object[][] objects = new String[][]{{"a","b","c"},{"d","e","f"}};

        Arrays.asList(objects).stream().forEach(
                x -> {
                    if (x instanceof String[])
                    Arrays.asList(x).stream().forEach(y -> consumer.accept(y));
                }
        );
    }
}
