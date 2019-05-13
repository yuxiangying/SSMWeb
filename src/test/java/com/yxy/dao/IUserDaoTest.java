package com.yxy.dao;

import com.yxy.model.UserInfo;
import com.yxy.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author : yuxiangying
 * @version V1.0
 * @Project: SSMWeb
 * @Package com.yxy.dao
 * @Description: TODO
 * @date Date : 2019年05月10日 15:30
 */
// 加载spring配置文件
@RunWith(SpringJUnit4ClassRunner.class)
/*@ContextConfiguration({"classpath:spring-mybatis.xml"})*/
public class IUserDaoTest {
    @Autowired
    private IUserDao dao;
    @Autowired
    private IUserService userService;

    @Test
    public void testSelectUser() throws Exception {
        long id = 1;
        /*UserInfo userInfo = dao.selectUser(id);*/
        UserInfo userInfo = userService.selectUser(id);
        System.out.println(userInfo.getUsername());
    }
}
