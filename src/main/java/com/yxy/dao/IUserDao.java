package com.yxy.dao;

import com.yxy.model.UserInfo;

/**
 * @author : yuxiangying
 * @version V1.0
 * @Project: SSMWeb
 * @Package com.yxy.dao
 * @Description: TODO
 * @date Date : 2019年05月10日 15:29
 */
public interface IUserDao {
    UserInfo selectUser(long id);
}
