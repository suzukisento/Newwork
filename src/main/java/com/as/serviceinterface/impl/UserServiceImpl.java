package com.as.serviceinterface.impl;

import com.as.domain.User;
import com.as.mapper.UserMapper;
import com.as.serviceinterface.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public PageInfo<User> queryByPage(Integer curPage, Integer pageSize) {
        //设置分页的相关信息
        PageHelper.startPage(curPage,pageSize);
        //查询数据
        List<User> users = userMapper.selectAll();
        //将查询到的数据整合到分页信息对象中
        PageInfo<User> pageInfo = new PageInfo<>(users);

        //返回数据
        return pageInfo;
    }
}
