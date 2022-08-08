package net.javaguides.springboot.service;

import net.javaguides.springboot.model.Skills;
import net.javaguides.springboot.model.StaffDepartment;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.RequestBody;

public interface StaffService {
    List<StaffDepartment> getAllStaffDepartment();
    StaffDepartment createStaff( StaffDepartment staffDepartment);
}



