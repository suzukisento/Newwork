package com.as.serviceinterface;

import com.as.domain.User;
import com.github.pagehelper.PageInfo;

public interface UserService {
    PageInfo<User> queryByPage(Integer curPage, Integer pageSize);
}
