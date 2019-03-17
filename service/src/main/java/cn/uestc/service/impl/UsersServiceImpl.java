package cn.uestc.service.impl;

import cn.uestc.dao.UsersMapper;
import cn.uestc.pojo.Users;
import cn.uestc.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersServiceImpl implements UsersService {
    @Autowired
    private UsersMapper usersMapper;

    @Override
    public void addUser(Users users) {
        usersMapper.insertUser(users);
    }
}
