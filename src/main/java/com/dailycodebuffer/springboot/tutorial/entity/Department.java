package com.dailycodebuffer.springboot.tutorial.entity;

import lombok.*;
import org.hibernate.validator.constraints.Length;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.*;

@Entity
//@Getter
//@Setter
@Data // to make this class using lombok ( which include inside the data the setter and getters..)
@NoArgsConstructor // this is the default constructor
@AllArgsConstructor // constructor with all the arguments
@Builder // builder pattern - will build the object with any number of parameters
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long departmentId;
    @NotBlank(message = "Please Add Department Name")//must have it in the request from client
    @Length(max=5,min =1 )
    @Size(max=10,min=0)

    //more validations
//    @Email
//    @Positive
//    @Negative
//    @NegativeOrZero
//    @PositiveOrZero
//    @Future
//    @FutureOrPresent
//    @Past
//    @PastOrPresent

    private String departmentName;//must have it in the request from client
    private String departmentAddress;
    private String departmentCode ;






}
