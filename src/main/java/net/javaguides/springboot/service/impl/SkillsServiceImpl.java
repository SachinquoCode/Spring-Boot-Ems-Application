package net.javaguides.springboot.service.impl;

import net.javaguides.springboot.model.Employee;
import net.javaguides.springboot.model.Skills;
import net.javaguides.springboot.model.StaffDepartment;
import net.javaguides.springboot.repository.EmployeeRepository;
import net.javaguides.springboot.repository.SkillsRepository;
import net.javaguides.springboot.service.SkillsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkillsServiceImpl implements SkillsService {

    @Autowired
    private SkillsRepository skillsRepository;
    @Autowired
    private EmployeeRepository employeeRepository;
    @Override
    public List<Skills> getAllSkills() {
        return skillsRepository.findAll();
    }

    @Override
    public Skills createSkill(Skills skills) {

        return skillsRepository.save(skills);
    }

    @Override
    public Skills enrollEmployeeToSkill(long skillId, Employee employeeId) {
        Skills skills = skillsRepository.findById(skillId).get();
        Employee employee = employeeRepository.findById(employeeId.getId()).get();
        skills.enrollEmployee(employee);
        return skillsRepository.save(skills);
    }
}
