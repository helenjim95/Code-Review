package de.tum.in.ase.eist.entities;

public abstract class Person {
    private final String name;
    private final int age;
    private final String email;
    int semester;

    public Person(final String name, final int age, final String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getEmail() { return email; }
}
