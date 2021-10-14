package com.dailycodebuffer.springboot.tutorial.controller;


import com.dailycodebuffer.springboot.tutorial.entity.Department;
import com.dailycodebuffer.springboot.tutorial.error.DepartmentNotFoundException;
import com.dailycodebuffer.springboot.tutorial.service.DepartmentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    private final Logger LOGGER = LoggerFactory.getLogger(DepartmentController.class);

    @PostMapping("/departments")
    public Department saveDepartment(@Valid @RequestBody Department department) { //@Valid will check the annotation that we have in the entity (@NotBlank)
        LOGGER.info("Inside saveDepartment od DepartmentController");
        return departmentService.saveDepartment(department);

    }

    @GetMapping("/departments")
    public List<Department> fetchDepartmentList() {

        LOGGER.info("Inside fetchDepartmentList od DepartmentController");
        return departmentService.fetchDepartmentList();
    }

    @GetMapping("/departments/{id}")
    public Department fetchDepartmentById(@PathVariable("id") Long departmentId)
            throws DepartmentNotFoundException { //once this controller exception we will go to class RestResponseEntityExceptionHandler because we have @ControllerAdvice there
        return departmentService.fetchDepartmentById(departmentId);


    }

    @DeleteMapping("/departments/{id}")
    public String deleteDepartmentById(@PathVariable("id") Long departmentId) {
        departmentService.deleteDepartmentById(departmentId);
        return "Department deleted Successfully!!";

    }

    @PutMapping("/departments/{id}")
    //here we are passing 2 parameters
    public Department updateDepartmentById(@PathVariable("id") Long departmentId,
                                           @RequestBody Department department) {
        return departmentService.updateDepartmentById(departmentId, department);

    }

    @GetMapping("/departments/name/{name}")
    public Department fetchDepartmentByName(@PathVariable("name") String departmentName) {
        return departmentService.fetchDepartmentByName(departmentName);
    }

    @GetMapping("/departments/code/{code}")
    public Department fetchDepartmentByCode(@PathVariable("code") String departmentCode) {
        return departmentService.fetchDepartmentByCode(departmentCode);
    }


}
