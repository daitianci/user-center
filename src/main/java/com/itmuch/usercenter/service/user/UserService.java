package com.itmuch.usercenter.service.user;

import com.itmuch.usercenter.domain.entity.user.User;
import com.itmuch.usercenter.mapper.user.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService {
    @Resource
    private UserMapper userMapper;

    public User findById(Integer id) {
        // select * from user where id = #{id}
        return this.userMapper.selectByPrimaryKey(id);
    }
}
