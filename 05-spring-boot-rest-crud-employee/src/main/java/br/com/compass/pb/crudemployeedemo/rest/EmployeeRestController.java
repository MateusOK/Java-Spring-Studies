package br.com.compass.pb.crudemployeedemo.rest;

import br.com.compass.pb.crudemployeedemo.entity.Employee;
import br.com.compass.pb.crudemployeedemo.service.EmployeeService;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

    private EmployeeService employeeService;

    @Autowired
    public EmployeeRestController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }


    @GetMapping("/employees")
    public List<Employee> findAll(){
        return employeeService.findAll();
    }

    @GetMapping("/employees/{employeeId}")
    public Employee findById(@PathVariable  Integer employeeId){
        Employee employee = employeeService.findById(employeeId);

        if (employee == null){
            throw new RuntimeException("Employee Id not found " + employeeId);
        }
        return employee;
    }


    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee employee){
        employee.setId(0);

        Employee dbEmployee  = employeeService.save(employee);
        return dbEmployee;
    }


    @PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee employee){
        Employee dbEmployee = employeeService.save(employee);
        return dbEmployee;
    }

    @DeleteMapping("/employees/{employeeId}")
    public String deleteEmployee(@PathVariable Integer employeeId){
        Employee employee = employeeService.findById(employeeId);

        if (employee == null){
            throw new RuntimeException("Employee id not found: " + employeeId);
        }
        employeeService.deleteById(employeeId);
        return "Employee deleted";
    }
}
