package com.zc.exercise.customer8082.controller;

import com.zc.exercise.common.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author zhangchi
 * @date 2019/11/26
 */
@Controller
public class CustomUserController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/custom/user/{id}")
    @ResponseBody
    public User findById(@PathVariable Long id){
        return restTemplate.getForObject("http://localhost:8081/user/{id}", User.class, id);
    }

    @GetMapping("/custom/user/list")
    @ResponseBody
    public List<User> findAll(){
        return restTemplate.getForObject("http://localhost:8081/user/list", List.class);
    }
}
