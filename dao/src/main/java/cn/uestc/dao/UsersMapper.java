package cn.uestc.dao;

import cn.uestc.pojo.Users;

import java.util.List;

public interface UsersMapper {
     int insertUser(Users users);
     List<Users> selectUserAll();
}
