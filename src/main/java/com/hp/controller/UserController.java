package com.hp.controller;

import com.hp.entity.User;
import com.hp.service.UserService;
import com.hp.service.impl.UserServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;

@RestController
@Api(value = "用户controller", tags = {"用户操作接口"})
public class UserController {

    private final static Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private UserService userService;

    @ApiOperation(value = "查询所有用户", tags = {"获取所有用户信息"})
    @GetMapping("/list")
    public Collection<User> list() {
        List<User> list = userService.list();
        logger.info("查询所有用户");
        return list;
    }

    @ApiOperation(value = "新增用户", tags = {"新增用户"})
    @ApiImplicitParam(name = "user", value = "用户对象")
    @RequestMapping("/add")
    public boolean add(User user) {
        logger.info("新增用户");
        return userService.save(user);
    }

    @ApiOperation(value = "修改用户", tags = {"修改用户"})
    @ApiImplicitParam(name = "user", value = "用户对象")
    @RequestMapping("/update")
    public boolean update(User user) {
        logger.info("修改用户");
        return userService.updateById(user);
    }

    @ApiOperation(value = "删除用户", tags = {"删除用户"})
    @ApiImplicitParam(name = "userId", value = "用户Id")
    @RequestMapping("/del")
    public boolean del(@RequestParam Integer userId) {
        logger.info("删除用户");
        return userService.removeById(userId);
    }
}
