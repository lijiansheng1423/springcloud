package com.itheima.service;

import com.itheima.entity.User;

import javax.persistence.EntityNotFoundException;

public interface IUserService {

     User getUser(Integer id) throws EntityNotFoundException;
     User insertUser(User user);
      int deleteUser(Integer id);
}
