package de.tum.in.ase.eist.entities;

public class Student {


    private String matrNr;
    public static String name;
    private static int age;
    private int semester;
    private String email;

    // TODO 1.1 : Bob is not good at Object Orientated Programming - fix it
  	// TODO 1.1 : Instead of implementing void setSemester(int i), implement void increaseSemester()

    // TODO 1.2 : Refactoring - Apply the template method design pattern on Student and Professor to prevent duplicated code

    public Student(String name, int age, String email, String matrNr, int semester) {
        this.matrNr = matrNr;
        Student.name = name;
        Student.age = age;
        this.semester = semester;
        this.email = email;
    }

    public String getMatrNr() {
        return matrNr;
    }
}
