package net.javaguides.springboot.repository;

import net.javaguides.springboot.model.Skills;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SkillsRepository extends JpaRepository<Skills,Long> {
}
