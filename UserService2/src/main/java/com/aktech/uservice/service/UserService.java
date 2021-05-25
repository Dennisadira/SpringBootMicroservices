package com.aktech.uservice.service;

import com.aktech.uservice.Vo.Department;
import com.aktech.uservice.Vo.ResTemplate;
import com.aktech.uservice.entity.User;
import com.aktech.uservice.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RestTemplate restTemplate;


    public User adduser(User user) {

        log.info("Inside adduser");
        return userRepository.save(user);
    }

    public ResTemplate getUserWithDepartment(Long id) {
        ResTemplate re = new ResTemplate();
        User user = userRepository.findByUserId(id);

        Department department = restTemplate.getForObject("http://DEPARTMENT-SERVICE:9003/departments/" + user.getUserId(), Department.class);




re.setDepartment(department);
re.setUser(user);

        return  re;
    }
}
