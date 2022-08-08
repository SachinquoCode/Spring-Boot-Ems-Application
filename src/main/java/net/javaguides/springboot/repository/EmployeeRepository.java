package net.javaguides.springboot.repository;

import net.javaguides.springboot.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    // All crud database methods
    @Query("select employee FROM Employee employee")
    List<Employee> getALLEmployee();

    @Query("select employee FROM Employee employee where employee.id=:n")
    List<Employee> getEmployeeById(@Param("n") long id);


    @Query("select employee FROM Employee employee where employee.id=:n")
    List<Employee> deleteEmployee(@Param("n") long id);

//    @Query("UPDATE employees SET first_name=employeeDetails.getFirstName(),last_name=employeeDetails.getLastName(),email_id0=first_name=employeeDetails.getEmailId() Where id=n")
    @Query("select employee FROM Employee employee where employee.id=:n")
    Employee updateEmployee(@Param("n") long id);

//    @Query("INSERT INTO employees(first_name, last_name, email_id0) VALUES(firstName, lastName, emailId)")
//    Employee createEmployeeQuery(String firstName, String lastName, String emailId);
}

