package com.solvd.university.service.impl;

import com.solvd.university.dao.PersonRepository;
import com.solvd.university.dao.impl.StudentRepositoryImpl;
import com.solvd.university.model.Student;
import com.solvd.university.service.PersonService;

import java.util.List;

public class StudentServiceImpl implements PersonService<Student> {
    private final PersonRepository studentRepository;

    public StudentServiceImpl() {
        this.studentRepository = new StudentRepositoryImpl();
    }

    public void create(Student student) {
        if(student.getName()!=null && student.getPhoneNumber()!=null && student.getEmail()!=null) {
            student.setId(null);
            studentRepository.create(student);
        }

    }

    public void delete(Student student) {
        studentRepository.delete(student);
    }
    public List<Student> findAll(){
        return studentRepository.findAll();
    }
}
