package com.dailycodebuffer.springboot.tutorial.repository;

import com.dailycodebuffer.springboot.tutorial.entity.Department;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import static org.junit.jupiter.api.Assertions.*;


@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE) // not working need to check
class DepartmentRepositoryTest {

    @Autowired
    private DepartmentRepository departmentRepository;

    @Autowired
    private TestEntityManager entityManager;


    @BeforeEach
    void setUp() {
        Department department =
                Department.builder()
                        .departmentName("Shadi")
                        .departmentCode("Me - 011")
                        .departmentAddress("Delhi")
                        .build();

        entityManager.persist(department);

    }

//    @Test
//    public void whenFindByID_ThenReturnDepartment(){
//        Department department = departmentRepository.findById(1L).get();
//        assertEquals(department.getDepartmentName(),"Shadi");
//    }
}