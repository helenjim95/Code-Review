package de.tum.in.ase.eist.entities;

public class Professor {

    private String persNr;
    public static String name;
    private static int age;
    private int semester;
    private String email;

    // TODO 1.1 : - Bob is not good at Object Orientated Programming - fix it

    // TODO 1.2 : Refactoring - Apply the template method design pattern on Student and Professor to prevent duplicated code

    public Professor(String name, int age, String email, String persNr) {
        this.persNr = persNr;
        Professor.name = name;
        Professor.age = age;
        this.email = email;
    }
}
