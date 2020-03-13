package cn.kgc.service.impl;

import cn.kgc.dao.UserDao;
import cn.kgc.pojo.Users;
import cn.kgc.service.UserService;

import java.util.List;

/**
 * @author 曹译
 * 日期：2020-03-12
 * desc：
 */
public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public List<Users> userList() {
        return this.userDao.userList();
    }
}
