package com.HibernateCrudApi_sync.ImplementingCrudapi_sync.service;

import com.HibernateCrudApi_sync.ImplementingCrudapi_sync.entity.Employees;

import java.util.List;

public interface EmployeeService {

    List<Employees> getAll();
    Employees get(int id);
    void update(Employees employeeObj);
    void Save(Employees employeeObj);
    void delete(int id);
}
