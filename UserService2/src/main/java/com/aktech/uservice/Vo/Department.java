package com.aktech.uservice.Vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;



@Data
@AllArgsConstructor
@NoArgsConstructor
@Slf4j
public class Department {


    long departmentId;
    String departmentName;
    String departmentAddress;
    String departmentCode;


}
