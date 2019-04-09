package com.lf.service.user;

import com.lf.model.User;

import java.util.List;

public interface UserService {

    User selectUserById(int id);
    List<User> selectAllUser();
    int addUser(User user);
    int updateUser(User user);
    public int deleteUser(int id);

}
