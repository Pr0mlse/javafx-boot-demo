package com.invoicing;

import com.invoicing.MainController;
import com.invoicing.Service.HeroService;
import com.invoicing.dao.*;
import com.invoicing.entity.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = MainController.class)
public class SQLTest {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private TypeMapper typeMapper;

    @Autowired
    private CommodityMapper commodityMapper;

    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    private OrderItemMapper orderItemMapper;

    @Autowired
    private VendMapper vendMapper;

    @Autowired
    private VendorItemMapper vendorItemMapper;

    @Test
    public void userTest() {
        User user = new User();
        user.setName("邦教授");
        user.setPassword("123qwe");
        //System.out.println(userMapper.insertUser(user));
        System.out.println(userMapper.selectByName("教授"));
        System.out.println(userMapper.selectCount());
    }

    @Test
    public void typeTest() {
        Type type = new Type();
        type.setTypeName("饮料");
        //System.out.println(typeMapper.insertType(type));
        System.out.println(typeMapper.selectByName("饮料"));
    }

    @Test
    public void commodityTest() {
        Commodity commodity = new Commodity();
        commodity.setName("芬达");
        commodity.setTypeId(1);
        commodity.setStock(20);
        commodity.setAlert(5);
        commodity.setPrice((float) 2.5);
        commodity.setDiscount((float) 1.0);

        //System.out.println(commodityMapper.insertCommodity(commodity));
        System.out.println(commodityMapper.selectById(1));
        System.out.println(commodityMapper.selectByName("雪碧"));
        List<Commodity> commodityList = commodityMapper.selectAll();
        for (Commodity commodity1 : commodityList) {
            System.out.println(commodity1);
        }

        //update
        commodityMapper.updateName(1, "快乐水");
        commodityMapper.updateTypeId(1, 1);
        commodityMapper.updateStock(1, 40);
        commodityMapper.updateAlert(1, 10);
        commodityMapper.updatePrice(1, (float) 3.0);
        commodityMapper.updateDiscount(1, (float) 0.8);

        commodity = commodityMapper.selectById(1);
     //   BigDecimal bd = new BigDecimal(commodity.getPrice()*commodity.getDiscount());
      //  bd = bd.setScale(2, RoundingMode.HALF_UP);
        System.out.println(commodity.getPrice()*commodity.getDiscount());

    }

    @Test
    public void orderTest() {
        Order order = new Order();
        order.setOrderPrice(70);
        order.setOrderTime(new Date());
       // System.out.println(orderMapper.insertOrder(order));
        System.out.println(orderMapper.selectById(1));
        System.out.println(orderMapper.selectRecent());
    }

    @Test
    public void orderItemTest() {
        OrderItem orderItem = new OrderItem();
        orderItem.setOrderId(1);
        orderItem.setOrderNum(1);
        orderItem.setId(1);
        orderItem.setOrderUnivalence(1);
        orderItem.setOrderCount(40);

        OrderItem orderItem1 = new OrderItem();
        orderItem1.setOrderId(1);
        orderItem1.setOrderNum(3);
        orderItem1.setId(1);
        orderItem1.setOrderUnivalence(1);
        orderItem1.setOrderCount(40);

        List<OrderItem> orderItemList = new ArrayList<OrderItem>();
        orderItemList.add(orderItem);
        orderItemList.add(orderItem1);
        System.out.println(orderItemMapper.selectByOrderId(1));
        //orderItemMapper.insertOrderItem(orderItemList);

        List<Commodity> list1 = orderItemMapper.selectCommodityByOrderId(1);
        for (Commodity commodity : list1) {
            System.out.println(commodity);
        }
    }

    @Test
    public void vendTest() {
        Vend vend = new Vend();
        vend.setVendTime(new Date());
        vend.setVendCost(20);
        //vendMapper.insertVend(vend);
        System.out.println(vendMapper.selectById(1));
        System.out.println(vendMapper.selectRecent());
    }

    @Test
    public void vendorItemTest() {
        VendorItem vendorItem = new VendorItem();
        vendorItem.setVendId(1);
        vendorItem.setVendNum(1);
        vendorItem.setId(1);
        vendorItem.setVendUnivalence(1);
        vendorItem.setVendCount(40);

        VendorItem vendorItem1 = new VendorItem();
        vendorItem1.setVendId(1);
        vendorItem1.setVendNum(2);
        vendorItem1.setId(2);
        vendorItem1.setVendUnivalence(1);
        vendorItem1.setVendCount(40);

        List<VendorItem> list = new ArrayList<VendorItem>();
        list.add(vendorItem);
        list.add(vendorItem1);
        //vendorItemMapper.insertVendorItem(list);
        System.out.println(vendorItemMapper.selectByVendId(1));

        List<Commodity> list1 = vendorItemMapper.selectCommodityByVendId(1);
        for (Commodity commodity : list1) {
            System.out.println(commodity);
        }

    }


}

