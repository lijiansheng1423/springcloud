package com.itheima.controller;

import com.itheima.entity.Order;
import com.itheima.entity.Produect;
import com.itheima.service.IOrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@Slf4j
public class OrderDiscoveryController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private IOrderService orderService;
    @Autowired
    private DiscoveryClient discoveryClient;

    @PostMapping("/order_discovery/produect")
    public Order order(@RequestParam("pid") Integer pid, @RequestParam("uid") Integer uid, @RequestParam("number") Integer number) {
        log.info("开始查询商品信息{}", pid);
      List<ServiceInstance> list= discoveryClient.getInstances("service-produect");
      Produect produect = restTemplate.getForObject("http://"+list.get(0).getHost() +":"+list.get(0).getPort() +"/produect/" + pid, Produect.class);
        log.info("查询到的商品信息 {} " + produect);
        Order order =new Order();
        order.setPname(produect.getPname());
        order.setPprice(produect.getPprice());
        order.setUid(uid);
        order.setUsername("LJS");
        order.setNumber(number);
        return  orderService.saveOrder(order);
    }
}
