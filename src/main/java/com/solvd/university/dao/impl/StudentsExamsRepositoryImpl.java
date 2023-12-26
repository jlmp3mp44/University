package com.solvd.university.dao.impl;

import com.solvd.university.dao.ConnectionPool;
import com.solvd.university.dao.ManyToManyRepository;
import com.solvd.university.model.Exam;
import com.solvd.university.model.Student;
import com.solvd.university.model.exceptions.ProcessException;

import java.sql.*;

public class StudentsExamsRepositoryImpl implements ManyToManyRepository<Student, Exam> {
    private static final ConnectionPool CONNECTION_POOL = ConnectionPool.getInstance();

    @Override
    public void create(Student student, Exam exam) {
        Connection connection = CONNECTION_POOL.getConnection();
        String insertInto = "INSERT INTO exams_students(exam_id, student_id) values (?,?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(insertInto, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setLong(1, exam.getId());
            preparedStatement.setLong(2, student.getId());
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            throw new ProcessException("Can`t create a exams_students", e);
        } finally {
            CONNECTION_POOL.releaseConnection(connection);
        }
    }
}
