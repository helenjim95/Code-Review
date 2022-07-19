package de.tum.in.ase.eist.entities;

public class Student extends Person {
    private final String matrNr;

    public Student(final String name, final int age, final String email, final String matrNr, int semester) {
        super(name, age, email, semester);
        this.matrNr = matrNr;
    }

    public String getMatrNr() {
        return matrNr;
    }
    public int getSemester() {
        return semester;
    }
    public void increaseSemester() {
        this.semester += 1;
    }
}
