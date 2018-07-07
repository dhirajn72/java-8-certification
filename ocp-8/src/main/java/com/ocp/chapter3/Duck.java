/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter3;

import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * @author Dhiraj
 * @date 07/07/18
 */
public class Duck {
    private int weight;
    private String name;

    public Duck(int weight, String name) {
        this.weight = weight;
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
