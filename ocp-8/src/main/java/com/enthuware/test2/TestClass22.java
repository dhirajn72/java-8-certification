/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware.test2;

enum Title {
    MR("Mr. "), MRS("Mrs. "), MS("Ms. ");
    private String title;

    private Title(String s) {
        title = s;
    }

    public String format(String first, String last) {
        return title + " " + first + " " + last;
    }
}


enum Title1 {
    DR;
    private Title t;
}

enum Title2 {
    DR;
    private Title t = Title.MR;
}

enum Title3 {
    DR;
    private Title t = Title.MR;

    public String format(String s) {
        return t.format(s, s);
    };
}

class TestClass {
    void someMethod() {
        System.out.println(Title.MR.format("Rob", "Miller"));
    }
}

/**
 * @author Dhiraj
 * @date 26/08/18
 */
public class TestClass22 {
    public static void main(String[] args) {

    }
}



