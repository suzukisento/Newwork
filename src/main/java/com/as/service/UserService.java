package com.as.service;

import com.as.domain.User;
import com.as.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserMapper userMapper;

    public User queryById(Long id){
        return userMapper.selectByPrimaryKey(id);
    }

    public void update(User user){
        userMapper.updateByPrimaryKey(user);
    }

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor =
            {Exception.class})
    public void save(User user){
        userMapper.insertSelective(user);
    }
    public List queryAll(){
        return userMapper.selectAll();
    }
}
