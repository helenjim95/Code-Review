package de.tum.in.ase.eist.entities;

public class Professor extends Person {
    private final String persNr;

    public Professor(final String name, final int age, final String email, final String persNr, int semester) {
        super(name, age, email, semester);
        this.persNr = persNr;
    }
}
