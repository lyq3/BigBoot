package com.lyq3.bigboot.upms.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.lyq3.bigboot.upms.api.UpmsUserService;
import com.lyq3.bigboot.upms.dao.entity.UpmsUser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class UpmsUserServiceImpl implements UpmsUserService {
    private static final Logger logger = LoggerFactory.getLogger(UpmsUserServiceImpl.class);
    @Override
    public UpmsUser addUser(UpmsUser user) {
        user.insert();
        logger.info("\n======添加用户成功=========\n"+user.toString());
        return user;
    }
}
