package org.example;

public class Developer {

    private Laptop laptop;


    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Developer() {
        System.out.println("Developer Constructor");
    }

    public void build() {
        System.out.println("working on Awesome Project");
        laptop.compile();
    }

}
