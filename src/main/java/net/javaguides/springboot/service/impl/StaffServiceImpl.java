package net.javaguides.springboot.service.impl;

import net.javaguides.springboot.model.StaffDepartment;
import net.javaguides.springboot.repository.StaffRepository;
import net.javaguides.springboot.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StaffServiceImpl implements StaffService {
    @Autowired
    private StaffRepository staffRepository;

    @Override
    public List<StaffDepartment> getAllStaffDepartment() {
        return staffRepository.findAll();
    }

    @Override
    public StaffDepartment createStaff(StaffDepartment staffDepartment) {
        System.out.println(staffDepartment.getStaffDepartmentName());
        return staffRepository.save(staffDepartment);
    }
}

