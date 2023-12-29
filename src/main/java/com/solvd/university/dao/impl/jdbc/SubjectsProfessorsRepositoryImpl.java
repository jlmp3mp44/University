package com.solvd.university.dao.impl.jdbc;

import com.solvd.university.dao.ConnectionPool;
import com.solvd.university.dao.ManyToManyRepository;
import com.solvd.university.dao.PersonRepository;
import com.solvd.university.model.Exam;
import com.solvd.university.model.Professor;
import com.solvd.university.model.Student;
import com.solvd.university.model.Subject;
import com.solvd.university.model.exceptions.ProcessException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class SubjectsProfessorsRepositoryImpl implements ManyToManyRepository<Subject, Professor> {
    private static final ConnectionPool CONNECTION_POOL = ConnectionPool.getInstance();

    @Override
    public void create(Subject subject, Professor professor) {
        Connection connection = CONNECTION_POOL.getConnection();
        String insertInto = "INSERT INTO proffessors_subjects(proffessor_id, subject_id) values (?,?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(insertInto, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setLong(1, professor.getId());
            preparedStatement.setLong(2, subject.getId());
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            throw new ProcessException("Can`t create a professors_subjects", e);
        } finally {
            CONNECTION_POOL.releaseConnection(connection);
        }
    }
}

