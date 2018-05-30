/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware.mock1;

import javafx.beans.binding.StringBinding;

import java.util.Date;

/**
 * @author Dhiraj
 * @date 28/05/18
 */
public class ImmutableTest {
    private final StringBuilder name;
    private final Date dob;

    public ImmutableTest(StringBuilder name, Date dob) {
        this.name = name;
        this.dob = dob;
    }

    public StringBuilder getName() {
        return name;
    }

    public Date getDob() {
        return dob;
    }

    public ImmutableTest changeName(StringBuilder name, Date dob){

        if(this.name.equals(name)&&dob.getDate()==this.dob.getDate()){
            return this;
        }else {
            return new ImmutableTest(new StringBuilder(name), new Date(dob.getTime()));

        }
    }



    public static void main(String[] args) {
        ImmutableTest i1= new ImmutableTest(new StringBuilder("rama"),new Date());

        StringBuilder na = new StringBuilder("rama");
       ImmutableTest i2= i1.changeName(na,i1.dob);
        System.out.println(i1==i2);
        System.out.println("".toUpperCase());

    }

    @Override
    public String toString() {
        return "ImmutableTest{" +
                "name=" + name +
                ", dob=" + dob +
                '}';
    }




}
