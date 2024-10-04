package com.HibernateCrudApi_sync.ImplementingCrudapi_sync.dao;

import com.HibernateCrudApi_sync.ImplementingCrudapi_sync.entity.Employees;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Transactional
public class CrudsyncdaoImpl implements Crudsyncdao{

    @Autowired
    EntityManager entityManager;
    @Override
    public List<Employees> getAll() {
       Session session=entityManager.unwrap(Session.class);
       Query<Employees> query=session.createQuery("from Employees", Employees.class);
        return query.getResultList();
    }

    @Override
    public Employees get(int id) {
        Session session=entityManager.unwrap(Session.class);
        Employees employeeObj= session.get(Employees.class,id);
        return employeeObj;
    }

    @Override
    public void update(Employees employeeObj) {

        Session session=entityManager.unwrap(Session.class);
        session.saveOrUpdate(employeeObj);


    }

    @Override
    public void Save(Employees employeeObj) {

        Session session=entityManager.unwrap(Session.class);
        session.save(employeeObj);

    }

    @Override
    public void delete(int id) {

        Session session=entityManager.unwrap(Session.class);
        Employees employeeObj= session.get(Employees.class,id);
        session.delete(employeeObj);


    }
}
