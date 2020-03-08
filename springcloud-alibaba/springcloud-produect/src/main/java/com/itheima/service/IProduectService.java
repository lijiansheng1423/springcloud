package com.itheima.service;

import com.itheima.entity.Produect;

public interface IProduectService {

    Produect getProduectById(Integer pid);
    public Produect saveProduect(Produect produect);
}
