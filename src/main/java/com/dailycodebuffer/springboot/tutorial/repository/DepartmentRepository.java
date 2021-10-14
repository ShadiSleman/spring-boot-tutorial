package com.dailycodebuffer.springboot.tutorial.repository;

import com.dailycodebuffer.springboot.tutorial.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Long> {


    //no need to implement ..just write the method (departmentname should be equal to the class parameter department name )
    //you have more examples here ..
    //https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#reference
    // Table 3. Supported keywords inside method names
    //if the query is complex then you have to use @query see example in the website.
    public Department findByDepartmentName(String departmentName);

    public Department findByDepartmentNameIgnoreCase(String departmentName);

    public Department findByDepartmentCode(String departmentCode);

}
