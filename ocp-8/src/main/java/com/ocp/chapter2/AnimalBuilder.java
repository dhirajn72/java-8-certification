/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter2;

import java.util.Date;

/**
 * @author Dhiraj
 * @date 23/07/18
 */
public class AnimalBuilder {
    private int id;
    private StringBuilder name;
    private Date dob;
    private double weight;

    public AnimalBuilder setId(int id) {
        this.id = id;
        return this;
    }
    public AnimalBuilder setName(StringBuilder name) {
        this.name = name;
        return this;
    }

    public AnimalBuilder setDob(Date dob) {
        this.dob = dob;
        return this;
    }

    public AnimalBuilder setWeight(double weight) {
        this.weight = weight;
        return this;
    }

    public ImmutableAnimal build() {
        return new ImmutableAnimal(id, name, dob, weight);
    }

/*    static class ImmutableAnimal {
        private final int id;
        private final StringBuilder name;
        private final Date dob;
        private final double weight;

        public ImmutableAnimal(int id, StringBuilder name, Date dob, double weight) {
            this.id = id;
            this.name = new StringBuilder(name);
            this.dob = new Date(dob.getTime());
            this.weight = weight;
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

        public ImmutableAnimal getObject() {
            return new ImmutableAnimal(this.id, this.name, this.dob, this.weight);
        }
    }*/
}
