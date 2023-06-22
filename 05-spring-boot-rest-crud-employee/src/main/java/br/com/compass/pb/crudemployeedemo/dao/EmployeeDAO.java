package br.com.compass.pb.crudemployeedemo.dao;

import br.com.compass.pb.crudemployeedemo.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> findAll();

    Employee findById(Integer id);
    Employee save(Employee employee);
    void deleteById(Integer id);
}
