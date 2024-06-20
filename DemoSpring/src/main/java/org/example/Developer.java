package org.example;

public class Developer {

    private Laptop laptop;

    public Developer() {
        System.out.println("Developer Constructor");
    }

    public void build() {
        System.out.println("working on Awesome Project");
        laptop.compile();
    }

}
