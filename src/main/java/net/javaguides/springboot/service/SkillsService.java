package net.javaguides.springboot.service;
import net.javaguides.springboot.model.Employee;
import net.javaguides.springboot.model.Skills;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface SkillsService {
    List<Skills> getAllSkills();
    Skills createSkill(@RequestBody Skills skills);

    Skills enrollEmployeeToSkill(long skillId, Employee employeeId);
}