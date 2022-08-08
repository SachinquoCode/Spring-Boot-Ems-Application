package net.javaguides.springboot.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "skills")
public class Skills {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "tech_skills")
    private String techSkill;

    @ManyToMany
    @JoinTable(
            name = "employee_enrolled",
            joinColumns = @JoinColumn(name = "skill_id"),
            inverseJoinColumns = @JoinColumn(name = "employee_id")
    )
    private Set<Employee> enrollEmployee = new HashSet<>();

    public void enrollEmployee(Employee employee) {
        enrollEmployee.add(employee);
    }

//    @ManyToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "emp_id")
//    private Employee employee;


}