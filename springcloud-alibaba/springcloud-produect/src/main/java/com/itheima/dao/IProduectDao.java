package com.itheima.dao;

import com.itheima.entity.Produect;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProduectDao extends JpaRepository<Produect,Integer> {
}
