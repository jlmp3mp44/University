package com.solvd.university.dao.impl;

import com.solvd.university.dao.ConnectionPool;
import com.solvd.university.dao.ManyToManyRepository;
import com.solvd.university.model.Professor;
import com.solvd.university.model.Speciality;
import com.solvd.university.model.Subject;
import com.solvd.university.model.exceptions.ProcessException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class SubjectSpecialityRepositoryImpl implements ManyToManyRepository<Subject, Speciality> {
    private static final ConnectionPool CONNECTION_POOL = ConnectionPool.getInstance();

    @Override
    public void create(Subject subject, Speciality speciality) {
        Connection connection = CONNECTION_POOL.getConnection();
        String insertInto = "INSERT INTO specialities_subjects(speciality_id, subject_id) values (?,?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(insertInto, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setLong(1, speciality.getId());
            preparedStatement.setLong(2, subject.getId());
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            throw new ProcessException("Can`t create a specialities_subjects", e);
        } finally {
            CONNECTION_POOL.releaseConnection(connection);
        }
    }
}

