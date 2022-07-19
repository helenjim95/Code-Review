package de.tum.in.ase.eist.service;

import de.tum.in.ase.eist.entities.Exam;
import de.tum.in.ase.eist.entities.Student;
import de.tum.in.ase.eist.repository.ExamRepository;
import de.tum.in.ase.eist.repository.StudentRepository;

import java.util.NoSuchElementException;

public class ExamManagementService {

    private final ExamRepository examRepository;
    private final StudentRepository studentRepository;

    public ExamManagementService(ExamRepository examRepository, StudentRepository studentRepository) {
        this.examRepository = examRepository;
        this.studentRepository = studentRepository;
    }

    public Student getStudentByMatrNr(String matrNr) {
        // 2.1 : throw NoSuchElementException in case the student was not found
        try {
            return studentRepository.getStudentByMatrNr(matrNr);
        } catch (NoSuchElementException e) {
            throw new NoSuchElementException("The student was not found");
        }
    }

    public void registerStudent(Student student) {
        if (studentIsNotNull(student)) {
            studentRepository.addStudent(student);
            System.out.println("Student has been registered successfully.");
        }
    }

    public void removeStudentByMatrNr(String matrNr) {
        studentRepository.removeStudentByMatrNr(matrNr);
        System.out.println("Student has been removed successfully");
    }


    public Exam getExamById(Long id) {
        try {
            return examRepository.getExamById(id);
        } catch (NoSuchElementException e) {
            throw new NoSuchElementException("The exam was not found");
        }
    }

    public void registerExam(Exam exam) {
        // 2.2 : Implement me
        if (examIsNotNull(exam)) {
            examRepository.registerExam(exam);
            System.out.println("Exam has been registered successfully.");
        }
    }

    public void removeExamById(Long id) {
        // 2.2 : Implement me
        try {
            examRepository.removeExamById(id);
            System.out.println("Exam has been removed successfully");
        } catch (Exception e) {
            throw new NoSuchElementException("The exam was not found");
        }
    }

    // Helper function
    boolean studentIsNotNull(Student student) {
        return student != null;
    }

    boolean examIsNotNull(Exam exam) {
        return exam != null;
    }
}
