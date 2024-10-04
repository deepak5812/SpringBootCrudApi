package com.HibernateCrudApi_sync.ImplementingCrudapi_sync.dao;


import com.HibernateCrudApi_sync.ImplementingCrudapi_sync.entity.Employees;

import java.util.List;

public interface Crudsyncdao {
    List<Employees> getAll();
    Employees get(int id);
    void update(Employees employeeObj);
    void Save(Employees employeeObj);
    void delete(int id);

}
