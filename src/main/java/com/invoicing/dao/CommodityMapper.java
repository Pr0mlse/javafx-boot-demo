package com.invoicing.dao;

import com.invoicing.entity.Commodity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface CommodityMapper {

    Commodity selectById(int id);

    Commodity selectByName(String name);

    List<Commodity> selectAll();

    int insertCommodity(Commodity commodity);

    int updateName(@Param("id")int id, @Param("name")String name);

    int updateTypeId(@Param("id")int id, @Param("typeId")int typeId);

    int updateStock(@Param("id")int id, @Param("stock")int stock);

    int updateAlert(@Param("id")int id, @Param("alert")int alert);

    int updatePrice(@Param("id")int id, @Param("price")float price);

    int updateDiscount(@Param("id")int id, @Param("discount")float discount);




}
