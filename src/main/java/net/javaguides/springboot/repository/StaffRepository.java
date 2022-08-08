package net.javaguides.springboot.repository;

import net.javaguides.springboot.model.StaffDepartment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface StaffRepository extends JpaRepository<StaffDepartment, Long> {
}
