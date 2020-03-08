package com.itheima.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="tb_order")
@Data
public class Order {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    /**
     * 用户uid
     */
    private Integer uid;
    /**
     * 用户名
     */
    private String username;
    /**
     * 商品名称
     */
    private String pname;
    /**
     * 商品价格
     */
    private Double pprice;
    /**
     * 数量
     */
    private Integer number;

}
