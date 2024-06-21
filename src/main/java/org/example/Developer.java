package org.example;

public class Developer {

//    private Laptop laptop;
    private Computer computer;
    private int age;

    public Developer() {
        System.out.println("Developer Constructor");
    }

    /*public Developer(Laptop laptop) {
        this.laptop = laptop;
        System.out.println("Developer 1 Constructor");
    }*/

    /*public Developer(int age) {
        this.age = age;
        System.out.println("Developer 1 Constructor");
    }*/

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /*public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }*/

    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }

    public void build() {
        System.out.println("working on Awesome Project");
//        laptop.compile();
        computer.compile();
    }

}
