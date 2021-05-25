package com.aktech.departmentservice.Service;

import com.aktech.departmentservice.entity.Department;
import com.aktech.departmentservice.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public Department getDepartmentId(Long departmentId){
       log.info("inside getDepartmentId " + departmentId);

        return departmentRepository.findByDepartmentId(departmentId);

    }

    public Department saveDepartment(Department department){
        log.info("inside saveDepartment ");

        return departmentRepository.save(department);
    }


}
