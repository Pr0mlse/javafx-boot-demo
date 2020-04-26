package com.invoicing.dao;

import com.invoicing.entity.Commodity;
import com.invoicing.entity.VendorItem;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface VendorItemMapper {

    /**
     * 查找 vendorItem
     * @param vendId
     * @return
     */
    List<VendorItem> selectByVendId(int vendId);

    /**
     * 查找 vendorItem 对应的 Commodity
     * @param vendId
     * @return
     */
    List<Commodity> selectCommodityByVendId(int vendId);

    int insertVendorItem(List<VendorItem> list);
}
