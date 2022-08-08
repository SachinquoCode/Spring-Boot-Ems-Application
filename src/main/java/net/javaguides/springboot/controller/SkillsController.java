package net.javaguides.springboot.controller;

import net.javaguides.springboot.model.Employee;
import net.javaguides.springboot.model.Skills;
import net.javaguides.springboot.model.StaffDepartment;
import net.javaguides.springboot.service.SkillsService;
import net.javaguides.springboot.service.StaffService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/skill")
public class SkillsController {
    private SkillsService skillsService;

    //    @Autowired
    public SkillsController(SkillsService skillsService) {
        super();
        this.skillsService = skillsService;
    }

    @GetMapping
    public List<Skills> getAllSkills(){

        return skillsService.getAllSkills();
    }
    //     build create employee Rest API
    @PostMapping
    public ResponseEntity<Skills> createSkill(@RequestBody Skills skills){

        return new ResponseEntity<Skills>(skillsService.createSkill(skills), HttpStatus.CREATED);
    }

    @PutMapping("/{skillId}/Employee")
    public ResponseEntity<Skills> enrollEmployeeToSkill(@PathVariable long skillId, @RequestBody Employee employeeId){
        return new ResponseEntity<Skills>(skillsService.enrollEmployeeToSkill(skillId,employeeId),HttpStatus.OK);
    }
}