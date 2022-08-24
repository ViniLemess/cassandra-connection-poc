package org.fundatec.ti19.vinilemess.cassandraconnectionpoc.service;

import org.fundatec.ti19.vinilemess.cassandraconnectionpoc.model.Student;
import org.fundatec.ti19.vinilemess.cassandraconnectionpoc.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class StudentService {
    private StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student saveStudent(Student newStudent) {
        return studentRepository.save(newStudent);
    }

    public Optional<Student> getStudentById(UUID id) {
        return studentRepository.findById(id);
    }

    public Iterable<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public void deleteAll() {
        studentRepository.deleteAll();
    }
}
