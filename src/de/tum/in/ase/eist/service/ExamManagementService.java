package de.tum.in.ase.eist.service;

import de.tum.in.ase.eist.entities.Exam;
import de.tum.in.ase.eist.entities.Student;
import de.tum.in.ase.eist.repository.ExamRepository;
import de.tum.in.ase.eist.repository.StudentRepository;

public class ExamManagementService {

    private final ExamRepository examRepository;
    private final StudentRepository studentRepository;

    public ExamManagementService(ExamRepository examRepository, StudentRepository studentRepository) {
        this.examRepository = examRepository;
        this.studentRepository = studentRepository;
    }

    public Student getStudentByMatrNr(String matrNr) {

        // TODO 2.1 : throw NoSuchElementException in case the student was not found

        return studentRepository.getStudentByMatrNr(matrNr);
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
        // TODO 2.2 : Implement me - don't forget to throw NoSuchElementException if exam cannot be found
        throw new RuntimeException("Not yet implemented");
    }

    public void registerExam(Exam exam) {
        // TODO 2.2 : Implement me
        throw new RuntimeException("Not yet implemented");
    }

    public void removeExamById(Long id) {
        // TODO 2.2 : Implement me
        throw new RuntimeException("Not yet implemented");
    }

    // Helper function
    boolean studentIsNotNull(Student student) {
        return student != null;
    }
}
