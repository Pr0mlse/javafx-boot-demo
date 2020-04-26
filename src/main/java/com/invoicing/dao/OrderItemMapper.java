package com.invoicing.dao;

import com.invoicing.entity.Commodity;
import com.invoicing.entity.OrderItem;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


import java.util.List;

@Mapper
public interface OrderItemMapper {

    /**
     * 根据 orderId 查找 orderItem
     * @param orderId
     * @return
     */
    List<OrderItem> selectByOrderId(int orderId);

    /**
     * 根据 orderId 查找对应的 Commodity
     * @param orderId
     * @return
     */
    List<Commodity> selectCommodityByOrderId(int orderId);

    int insertOrderItem(List<OrderItem> list);


}
