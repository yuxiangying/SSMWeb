package com.yxy.service.impl;

import com.yxy.dao.IUserDao;
import com.yxy.model.UserInfo;
import com.yxy.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author : yuxiangying
 * @version V1.0
 * @Project: SSMWeb
 * @Package com.yxy.service.impl
 * @Description: TODO
 * @date Date : 2019年05月10日 15:19
 */
@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private IUserDao userDao;

    @Override
    public UserInfo selectUser(long userId) {
        UserInfo userInfo=null;
        try {
             userInfo = userDao.selectUser(userId);
        }catch (Exception e){
            System.out.println(e.getMessage());
           e.printStackTrace();
        }
        return userInfo;
    }

    /*public UserInfo selectUser(long userId) {
        return this.userDao.selectUser(userId);
    }*/
}
