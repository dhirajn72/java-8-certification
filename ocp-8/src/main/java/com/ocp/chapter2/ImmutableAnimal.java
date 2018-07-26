/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter2;

import java.util.Date;

/**
 * @author Dhiraj
 * @date 22/07/18
 */
final public class ImmutableAnimal {
    private final int id;
    private final StringBuilder name;
    private final Date dob;
    private final double weight;

    public ImmutableAnimal(int id, StringBuilder name, Date dob,double weight) {
        this.id = id;
        this.name = new StringBuilder(name);
        this.dob = new Date(dob.getTime());
        this.weight=weight;
    }

    public int getId() {
        return id;
    }

    public StringBuilder getName() {
        return new StringBuilder(this.name);
    }

    public Date getDob() {
        return new Date(this.dob.getTime());
    }

    public double getWeight() {
        return weight;
    }

    public ImmutableAnimal getObject(){
        return new ImmutableAnimal(this.id,this.name,this.dob,this.weight);
    }
}
