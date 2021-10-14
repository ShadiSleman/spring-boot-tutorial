package com.dailycodebuffer.springboot.tutorial.controller;

import com.dailycodebuffer.springboot.tutorial.entity.Department;
import com.dailycodebuffer.springboot.tutorial.service.DepartmentService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcResultMatchersDsl;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.awt.*;


@WebMvcTest(DepartmentController.class)//because we are testing controller and we are using endpoints
class DepartmentControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private DepartmentService departmentService;

    private Department department;

    @BeforeEach
    void setUp() {
        department = Department.builder()
                .departmentAddress("Ahmedabad")
                .departmentCode("IT-06")
                .departmentName("IT")
                .departmentId(1L)
                .build();
    }

//    @Test
//    @Disabled
//    void saveDepartment() throws Exception {
////input
//        Department inputDepartment = Department.builder()
//                .departmentAddress("Ahmedabad")
//                .departmentCode("IT-06")
//                .departmentName("IT")
//                //.departmentId(1L)
//                .build();
//
//        Mockito.when(departmentService.saveDepartment(inputDepartment))
//                .thenReturn(department);
//
//        //call endpoint
//        mockMvc.perform(MockMvcRequestBuilders.post("/departments")
//                .contentType(MediaType.APPLICATION_JSON)
//                //copying from postman
//                .content("{\n"+
//                        "\t\"departmentName\":\"IT\",\n"+
//                        "\t\"departmentAddress\":\"Ahmedabad\",\n"+
//                        "\t\"departmentCode\":\"IT-06\",\n"+
//                        "}"))
//        .andExpect(MockMvcResultMatchers.status().isOk());
//    }

//    @Test
//    @Disabled
//    void fetchDepartmentById() {
//
//    }
}