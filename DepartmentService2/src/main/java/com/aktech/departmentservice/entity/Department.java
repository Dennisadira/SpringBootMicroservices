package com.aktech.departmentservice.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Slf4j
public class Department {

@Id
@GeneratedValue( strategy = GenerationType.AUTO)
    long departmentId;
    String departmentName;
    String departmentAddress;
    String departmentCode;


}
