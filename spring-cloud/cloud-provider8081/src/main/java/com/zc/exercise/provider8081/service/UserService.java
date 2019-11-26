package com.zc.exercise.provider8081.service;

import com.zc.exercise.common.domain.User;
import com.zc.exercise.provider8081.mapper.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author zhangchi
 * @date 2019/11/26
 */
@Service
public class UserService {
    @Resource
    private UserMapper userMapper;

    public void add(User user){
        userMapper.insert(user);
    }

    public void delete(Long id){
        userMapper.delete(id);
    }

    public void update(User user){
        userMapper.update(user);
    }

    public User findById(Long id){
        return userMapper.findById(id);
    }

    public List<User> findAll(){
        return userMapper.findAll();
    }
}
