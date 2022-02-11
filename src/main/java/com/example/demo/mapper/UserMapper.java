package com.example.demo.mapper;

import com.example.demo.dto.UserSelectDto;
import com.example.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface UserMapper {
    void save(@Param("user") User user); //对象当参数 加@Param("")注解
    int delete(long id);
    int update(@Param("user")User user);
    List<User> select(@Param("userSelectDto")UserSelectDto userSelectDto);

    List<User> queryAll();
}
