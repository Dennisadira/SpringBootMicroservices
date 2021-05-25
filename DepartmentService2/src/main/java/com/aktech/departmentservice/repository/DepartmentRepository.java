package com.aktech.departmentservice.repository;

import com.aktech.departmentservice.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository <Department, Long> {
    Department findByDepartmentId(Long id);


    // Department getDepartmentId(Long id);
}
