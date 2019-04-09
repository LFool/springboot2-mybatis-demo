package com.lf.service.user.impl;

import com.lf.mapper.UserMapper;
import com.lf.model.User;
import com.lf.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "userService")
public class UserServiceImpl implements UserService {


    private UserMapper userMapper;//这里会报错，但是并不会影响


    @Override
    public User selectUserById(int id) {
        return this.userMapper.selectUserById(id);
    }

    @Override
    public List<User> selectAllUser() {
        return this.userMapper.selectAllUser();
    }

    @Override
    public int addUser(User user) {
        return this.userMapper.addUser(user);
    }

    @Override
    public int updateUser(User user) {
        return this.userMapper.updateUser(user);
    }

    @Override
    public int deleteUser(int id) {
        return this.userMapper.deleteUser(id);
    }


}
