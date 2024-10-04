package com.HibernateCrudApi_sync.ImplementingCrudapi_sync.service;

import com.HibernateCrudApi_sync.ImplementingCrudapi_sync.dao.Crudsyncdao;
import com.HibernateCrudApi_sync.ImplementingCrudapi_sync.entity.Employees;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements  EmployeeService{

    @Autowired
    Crudsyncdao crudsyncdao;


    @Override
    public List<Employees> getAll() {
        return crudsyncdao.getAll();
    }

    @Override
    public Employees get(int id) {
        return crudsyncdao.get(id);
    }

    @Override
    public void update(Employees employeeObj) {
        crudsyncdao.update(employeeObj);
    }

    @Override
    public void Save(Employees employeeObj) {
        crudsyncdao.Save(employeeObj);
    }

    @Override
    public void delete(int id) {
        crudsyncdao.delete(id);
    }
}
