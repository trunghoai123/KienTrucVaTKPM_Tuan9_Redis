package com.example.demo.dao;

import java.util.Map;

import com.example.demo.model.Employee;

public interface IEmployeeDao {

    void saveEmployee(Employee emp);
    Employee getOneEmployee(Integer id);
    void updateEmployee(Employee emp);
    Map<Integer, Employee> getAllEmployees();
    void deleteEmployee(Integer id);
    void saveAllEmployees(Map<Integer, Employee> map);

}