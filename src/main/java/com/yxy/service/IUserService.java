package com.yxy.service;

import com.yxy.model.UserInfo;

/**
 * @author : yuxiangying
 * @version V1.0
 * @Project: SSMWeb
 * @Package com.yxy.service
 * @Description: TODO
 * @date Date : 2019年05月10日 15:18
 */
public interface IUserService {
    public UserInfo selectUser(long userId);
}
