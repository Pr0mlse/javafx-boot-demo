package com.invoicing.dao;

import com.invoicing.entity.Type;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TypeMapper {

    Type selectByName(String name);

    int insertType(Type type);
}
