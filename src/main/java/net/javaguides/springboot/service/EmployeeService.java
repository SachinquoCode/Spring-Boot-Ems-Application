package net.javaguides.springboot.service;

import net.javaguides.springboot.model.Employee;
import net.javaguides.springboot.model.Skills;
import net.javaguides.springboot.model.StaffDepartment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface EmployeeService {
    List<Employee> getALLEmployee();
    Employee createEmployee( Employee employee);
    List<Employee> getEmployeeById(long id);
    Employee updateEmployee(long id, Employee employeeDetails);
    void deleteEmployee( long id);
    Employee assignEmployeeToStaffDepartment( long employeeId, StaffDepartment staffDepartmentId);
}
