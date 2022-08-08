package net.javaguides.springboot.service.impl;

import net.javaguides.springboot.model.Employee;
import net.javaguides.springboot.model.StaffDepartment;
import net.javaguides.springboot.repository.EmployeeRepository;
import net.javaguides.springboot.repository.StaffRepository;
import net.javaguides.springboot.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;
    @Autowired
    private StaffRepository staffRepository;

    @Override
    public List<Employee> getALLEmployee() {

        return employeeRepository.getALLEmployee();
    }

    @Override
    public Employee createEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public List<Employee> getEmployeeById(long id) {
        return employeeRepository.getEmployeeById(id);
//                .orElseThrow(()-> new ResourceNotFoundException("Employee not exist with id " +id));
    }

    @Override
    public Employee updateEmployee(long id, Employee employeeDetails) {
        // we need to check whether employee with given id is exist in DB or not
        Employee updateEmployee = employeeRepository.updateEmployee(id);
//                .orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id " +id));
        updateEmployee.setFirstName(employeeDetails.getFirstName());
        updateEmployee.setLastName(employeeDetails.getLastName());
        updateEmployee.setEmailId(employeeDetails.getEmailId());
        // save existing employee to DB
        employeeRepository.save(updateEmployee);
        return updateEmployee;
    }
//
    @Override
    public void deleteEmployee(long id) {
        employeeRepository.deleteEmployee(id);
        employeeRepository.deleteById(id);
    }

    @Override
    public Employee assignEmployeeToStaffDepartment(long employeeId, StaffDepartment staffDepartmentId) {
        Employee employee = employeeRepository.findById(employeeId).get();
        StaffDepartment staffDepartment  = staffRepository.findById(staffDepartmentId.getId()).get();
        employee.assignStaffDepartment(staffDepartment);
        return employeeRepository.save(employee);
    }

}
