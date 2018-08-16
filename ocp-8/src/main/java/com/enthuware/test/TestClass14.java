/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware.test;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Dhiraj
 * @date 12/08/18
 */

class Persn {
    private String name;
    public Persn(String name) {  this.name = name;    }
    public String getName() { return name;  }
    public void setName(String name) { this.name = name; }

    public String toString() { return name; }
}

public class TestClass14 {
    public void helpPeople(Queue people, Queue helped) {
        do {
            Persn p = (Persn) people.poll();
            System.out.println("Helped : " + p + " ");
            helped.offer(p.getName());
        } while (!people.isEmpty());
    }

    public static void main(String[] args) {
        Queue<Persn> q = new LinkedList<>();
        q.offer(new Persn("Pope"));
        q.offer(new Persn("John"));
        Queue<Persn> helpedQ = new LinkedList<Persn>();
        TestClass14 h = new TestClass14();
        System.out.println(helpedQ);
        h.helpPeople(q, helpedQ);
        System.out.println(helpedQ);
        System.out.println("*****");

        Queue<Persn> p = new LinkedList<Persn>();
        p.offer(new Persn("x-men"));
        h.add(p);
        System.out.println(p);

    }

    private void add(Queue p) {
        p.offer("modified");
    }
}