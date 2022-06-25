package de.tum.in.ase.eist.application;

import de.tum.in.ase.eist.entities.Student;
import de.tum.in.ase.eist.repository.ExamRepository;
import de.tum.in.ase.eist.repository.StudentRepository;
import de.tum.in.ase.eist.service.ExamManagementService;

public class Main {
    public static void main(String[] args) {
        // Test program here

        Student bob = new Student("Bob", 22,"bob@mail.com", "bo5454",5);
        Student alice = new Student("Alice", 21,"alice@mail.com", "al5454",3);

        ExamManagementService service = new ExamManagementService(new ExamRepository(), new StudentRepository());

        service.registerStudent(bob);
        service.registerStudent(alice);

        service.removeStudentByMatrNr(bob.getMatrNr());

    }
}
