package net.javaguides.springboot.controller;

import net.javaguides.springboot.model.Employee;
import net.javaguides.springboot.model.StaffDepartment;
import net.javaguides.springboot.service.EmployeeService;
import net.javaguides.springboot.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/staff")
public class StaffController {
//    public StaffController(){
//
//    }

    private StaffService staffService;

//    @Autowired
    public StaffController(StaffService staffService) {
        super();
        this.staffService = staffService;
    }

    @GetMapping
    public List<StaffDepartment> getAllStaffDepartment(){
        return staffService.getAllStaffDepartment();
    }
    //     build create employee Rest API
    @PostMapping
    public ResponseEntity<StaffDepartment> createStaff(@RequestBody StaffDepartment staffDepartment){
        System.out.println(staffDepartment.getStaffDepartmentName());
        return new ResponseEntity<StaffDepartment>(staffService.createStaff(staffDepartment), HttpStatus.CREATED);
    }

}
