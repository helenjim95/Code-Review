package de.tum.in.ase.eist.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Exam {

    private final Long id;
    private final LocalDate date;
    private final String subject;
    private final Professor supervisingProfessor;
    private final List<Student> participatingStudents;

    public Exam(final Long id, final LocalDate date, final String subject, final Professor supervisingProfessor) {
        this.id = id;
        this.date = date;
        this.subject = subject;
        this.supervisingProfessor = supervisingProfessor;
        this.participatingStudents = new ArrayList<>();
    }

    public Long getId() {
        return id;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getSubject() {
        return subject;
    }

    public Professor getSupervisingProfessor() {
        return supervisingProfessor;
    }

    public List<Student> getParticipatingStudents() {
        return participatingStudents;
    }

    public void addStudent(Student student) {
        this.participatingStudents.add(student);
    }

    public void removeStudent(Student student) {
        this.participatingStudents.remove(student);
    }
}
