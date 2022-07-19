package de.tum.in.ase.eist.repository;

import de.tum.in.ase.eist.entities.Student;

import java.util.HashMap;
import java.util.NoSuchElementException;

public class StudentRepository {

    private HashMap<String, Student> repo;

    public StudentRepository() {
        this.repo = new HashMap<>();
    }

    /**
     * @param matrNr
     * @return the value to which the specified key is mapped,
     * or null if this map contains no mapping for the key
     */
    public Student getStudentByMatrNr(String matrNr) {
        return this.repo.get(matrNr);

    }

    public void addStudent(Student student) {
        this.repo.put(student.getMatrNr(), student);
    }

    public void removeStudentByMatrNr(String matrNr) {
        this.repo.remove(matrNr);
    }

}