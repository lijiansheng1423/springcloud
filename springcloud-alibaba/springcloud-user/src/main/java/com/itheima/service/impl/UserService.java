package com.itheima.service.impl;

import com.itheima.dao.UserDao;
import com.itheima.entity.User;
import com.itheima.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;

@Service
public class UserService implements IUserService {

    @Autowired
    private UserDao userDao;
    @Override
    public User getUser(Integer id)throws EntityNotFoundException {

        return  userDao.getOne(id);
    }

    @Override
    public User insertUser(User user) {
        User user1= userDao.saveAndFlush(user);
        return  user1;
    }

    @Override
    public int deleteUser(Integer id) {
         userDao.deleteById(id);
         return  1;
    }
}
