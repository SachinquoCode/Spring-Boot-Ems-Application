package net.javaguides.springboot.repository;

import net.javaguides.springboot.model.Bank;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankRepository extends JpaRepository<Bank, Long > {
}
