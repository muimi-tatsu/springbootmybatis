package com.hp.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import com.hp.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper extends BaseMapper<User> {
}
