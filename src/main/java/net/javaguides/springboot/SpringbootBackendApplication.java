package net.javaguides.springboot;

import net.javaguides.springboot.model.Employee;
import net.javaguides.springboot.model.StaffDepartment;
import net.javaguides.springboot.repository.EmployeeRepository;
import net.javaguides.springboot.repository.StaffRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {

		SpringApplication.run(SpringbootBackendApplication.class, args);
	}
    @Autowired
	private EmployeeRepository employeeRepository;
	@Autowired
	private StaffRepository staffRepository;
	@Override
	public void run(String... args) throws Exception {
//		StaffDepartment staffDepartment = new StaffDepartment();
//		staffDepartment.setJobRoll("engineer");
//		Employee employee = new Employee();
//		employee.setFirstName("sachin");
//		employee.setLastName("kore");
//		employee.setEmailId("sachin@gmail.com");
//		employeeRepository.save(employee);
//
//		Employee employee2 = new Employee();
//		employee2.setFirstName("kapil");
//		employee2.setLastName("more");
//		employee2.setEmailId("kapil@gmail.com");
//		employeeRepository.save(employee2);

	}
}
