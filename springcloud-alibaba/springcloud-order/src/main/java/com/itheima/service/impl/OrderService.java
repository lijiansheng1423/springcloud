package com.itheima.service.impl;

import com.itheima.dao.OrderDao;
import com.itheima.entity.Order;
import com.itheima.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService implements IOrderService {
    @Autowired
    private OrderDao orderDao;

    @Override
    public Order saveOrder(Order order) {
        Order order1 = orderDao.save(order);
        return order1;
    }
}
