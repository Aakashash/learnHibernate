package com.example.learnHibernate.hibernate.service;

import com.example.learnHibernate.hibernate.dao.employeeDAO;
import com.example.learnHibernate.hibernate.employee.employee;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class employeeService {

    @Autowired
    private  employeeDAO employeeDAO;
   // @Autowired
  //  private EntityManager entityManager;

    public employee getemployee(int id){
        employee e = employeeDAO.getemployee(id);
        return e;
    }
    public void putemployee(employee e){
         employeeDAO.putemployee(e);

    }
}
