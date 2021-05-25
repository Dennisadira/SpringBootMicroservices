package com.aktech.departmentservice.controller;


import com.aktech.departmentservice.Service.DepartmentService;
import com.aktech.departmentservice.entity.Department;
import com.aktech.departmentservice.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping("/departments")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @GetMapping("/{id}")
    public Department getDepartmentById(@PathVariable Long id) {
        log.info("inside  getDepartmentById ");
        return  departmentService.getDepartmentId(id);
    }

    @PostMapping("/")
    public Department saveDepartment(@RequestBody Department department){
        log.info("inside  saveDepartment");
        return departmentService.saveDepartment(department);
    }
}
