package com.invoicing.dao;


import com.invoicing.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    User selectByName(String name);

    int selectCount();

    int insertUser(User user);
}
