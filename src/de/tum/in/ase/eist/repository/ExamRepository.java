package de.tum.in.ase.eist.repository;

import de.tum.in.ase.eist.entities.Exam;

import java.util.HashMap;

public class ExamRepository {

    private HashMap<Long, Exam> repo;

    public ExamRepository() {
        this.repo = new HashMap<>();
    }

    /**
     * @param examID
     * @return the value to which the specified key is mapped,
     * or null if this map contains no mapping for the key
     */
    public Exam getExamById(Long examID) {
        return this.repo.get(examID);
    }


    public void registerExam(Exam exam) {
        this.repo.put(exam.getId(), exam);
    }

    public void removeExamById(Long examID) {
        this.repo.remove(examID);
    }

}
