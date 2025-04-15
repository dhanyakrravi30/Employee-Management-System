package com.example.ems_backend.repository;

import com.example.ems_backend.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    @Modifying
    @Transactional
    @Query(value = "ALTER TABLE employees AUTO_INCREMENT = 1", nativeQuery = true)
    void resetAutoIncrement();
}
