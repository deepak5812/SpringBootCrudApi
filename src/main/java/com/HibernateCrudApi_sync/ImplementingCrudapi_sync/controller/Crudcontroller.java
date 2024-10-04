package com.HibernateCrudApi_sync.ImplementingCrudapi_sync.controller;

import com.HibernateCrudApi_sync.ImplementingCrudapi_sync.entity.Employees;
import com.HibernateCrudApi_sync.ImplementingCrudapi_sync.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class Crudcontroller {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/getallemployees")
    public List<Employees> getAllEmployees(){
        return employeeService.getAll();
    }
    @GetMapping("/getemployee/{id}")
    public Employees getEmployee(@PathVariable int id){
        return employeeService.get(id);
    }
    @PostMapping("/saveemployees")
    public String postEmployee(@RequestBody Employees employeeObj){
        try{
            employeeService.Save(employeeObj);
        }
        catch(Exception e){
            return "Your Data is not saved due to "+ e.getMessage();
        }
         return "You have successfully saved the employee info";
    }

    @DeleteMapping("/deleteemployee/{id}")
    public String getAllEmployees(@PathVariable int id){
        try{
            employeeService.delete(id);
        }
        catch(Exception e){
            return "You Haven't successfully deleted the employee info due to "+ e.getMessage();
        }
        return "You have successfully deleted the employee info";
    }

    @PostMapping("/updatemployee")
    public String updateEmployee(@RequestBody Employees employeeObj){
        try{
            employeeService.Save(employeeObj);
        }
        catch(Exception e){
            return "You Haven't successfully updated the employee due to "+ e.getMessage();
        }
        return "You have successfully updated the employee info";
    }

}
