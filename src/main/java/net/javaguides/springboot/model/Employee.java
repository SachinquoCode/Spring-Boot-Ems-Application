package net.javaguides.springboot.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotNull
    @Size(min = 2, message = "First Name should have at least 2 characters")
    @Column(name = "first_name")
    private String firstName;

    @NotNull
    @Size(min = 2, message = "Last Name should have at least 2 characters")
    @Column(name = "last_name")
    private String lastName;

    @NotBlank
    @Email
    @Column(name = "email_id")
    private String emailId;

    @JsonIgnore
    @ManyToMany(mappedBy = "enrollEmployee")
    private Set<Skills> skills = new HashSet<>();

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "staff_Department_id", referencedColumnName = "id")
    private StaffDepartment staffDepartment;

    public void assignStaffDepartment(StaffDepartment staffDepartment) {
        this.staffDepartment = staffDepartment;
    }


//    @JoinColumn(name = "fk_bank")
//    @OneToOne(cascade = CascadeType.ALL)
//    private Bank bank;

//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "employee")
////    @JoinColumn(name = "emp_id",referencedColumnName = "id")
//    private List<Skills> skills;

//    @ManyToMany(cascade = CascadeType.ALL)
//    private Set<Address> address;

}
