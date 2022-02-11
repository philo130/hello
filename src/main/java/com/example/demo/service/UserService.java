package com.example.demo.service;

import com.example.demo.mapper.UserMapper;
import com.example.demo.dto.UserDeleteDto;
import com.example.demo.dto.UserSaveDto;
import com.example.demo.dto.UserSelectDto;
import com.example.demo.dto.UserUpdateDto;
import com.example.demo.entity.User;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService {
    @Resource
    private UserMapper userMapper;

    public void save(UserSaveDto userSaveDto) {
        User user = new User();
        BeanUtils.copyProperties(userSaveDto, user);
        userMapper.save(user);
    }

    public void delete(UserDeleteDto userDeleteDto) {
        userMapper.delete(userDeleteDto.getId());
    }

    public void update(UserUpdateDto userUpdateDto) {
        User user = new User();
        BeanUtils.copyProperties(userUpdateDto, user);
        userMapper.update(user);

    }

    public void select(UserSelectDto userSelectDto) {
        userMapper.select(userSelectDto);
    }

}
