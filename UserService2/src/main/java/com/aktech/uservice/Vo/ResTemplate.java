package com.aktech.uservice.Vo;

import com.aktech.uservice.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResTemplate {

    User user;
    Department department;


}
