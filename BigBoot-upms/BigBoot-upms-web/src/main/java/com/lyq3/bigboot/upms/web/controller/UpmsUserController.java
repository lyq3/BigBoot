package com.lyq3.bigboot.upms.web.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.lyq3.bigboot.common.base.UniteResult;
import com.lyq3.bigboot.upms.api.UpmsUserService;
import com.lyq3.bigboot.upms.dao.entity.UpmsUser;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户中心
 * @author 卡卢比
 */
@RestController
@RequestMapping("/user")
@Api(value = "用户中心接口",tags = "用户相关的操作")
public class UpmsUserController {
    @Reference
    private UpmsUserService upmsUserService;

    /**
     * 添加用户
     * @param user
     * @return
     */
    @PostMapping("/add")
    @ApiOperation("添加用户 ")
    public UniteResult<UpmsUser> addUser(UpmsUser user){
        UpmsUser upmsUser  = upmsUserService.addUser(user);
        return new UniteResult<UpmsUser>().setData(upmsUser);
    }
}
