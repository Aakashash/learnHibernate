package com.example.learnHibernate.hibernate.dao;

import com.example.learnHibernate.hibernate.employee.employee;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Repository
public class employeeDAO {

    @Autowired
    private EntityManager entityManager;

    public employee getemployee(int id){
        Session currentsession = entityManager.unwrap(Session.class);
        employee employee  =  currentsession.get(employee.class,id);
        return employee;

    }
}
