package net.javaguides.springboot.controller;

import net.javaguides.springboot.model.Employee;
import net.javaguides.springboot.model.Skills;
import net.javaguides.springboot.model.StaffDepartment;
import net.javaguides.springboot.service.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
//    @Autowired
//    private EmployeeRepository employeeRepository;
    private EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        super();
        this.employeeService = employeeService;
    }

    @GetMapping
    public List<Employee> getALLEmployee(){
        return employeeService.getALLEmployee();
    }
//     build create employee Rest API
    @PostMapping
    public ResponseEntity<Employee> createEmployee(@Valid @RequestBody Employee employee){
        System.out.println(employee.getFirstName());
        return new ResponseEntity<Employee>(employeeService.createEmployee(employee), HttpStatus.CREATED);
    }

    //build get employee by ID REST API
    @GetMapping("{id}")
    public List<Employee> getEmployeeById(@PathVariable long id){
        return employeeService.getEmployeeById(id);

    }

    //buiLd update employee REST API
    @PutMapping("{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable long id,@Valid @RequestBody Employee employeeDetails){
        return new ResponseEntity<Employee>(employeeService.updateEmployee(id, employeeDetails),HttpStatus.OK);
//        return employeeService.updateEmployee( id, Employee employeeDetails);
    }

    //build delete employee REST API
    @DeleteMapping("{id}")
    public ResponseEntity<HttpStatus> deleteEmployee(@PathVariable long id){
        employeeService.deleteEmployee(id);
        return new ResponseEntity<HttpStatus>(HttpStatus.NO_CONTENT);
    }
    @PutMapping("/{employeeId}/staffDepartment")
    public ResponseEntity<Employee> assignEmployeeToStaffDepartment(@PathVariable long employeeId, @Valid @RequestBody StaffDepartment staffDepartmentId){
        return new ResponseEntity<Employee>(employeeService.assignEmployeeToStaffDepartment(employeeId,staffDepartmentId),HttpStatus.OK);
    }
}
