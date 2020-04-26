package com.invoicing.dao;

import com.invoicing.entity.Vend;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface VendMapper {

    Vend selectById(int vendId);

    Vend selectRecent();

    int insertVend(Vend vend);

}
