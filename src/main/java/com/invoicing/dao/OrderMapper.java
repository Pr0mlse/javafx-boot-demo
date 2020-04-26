package com.invoicing.dao;

import com.invoicing.entity.Order;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderMapper {

    Order selectById(int orderId);

    Order selectRecent();

    int insertOrder(Order order);
}
