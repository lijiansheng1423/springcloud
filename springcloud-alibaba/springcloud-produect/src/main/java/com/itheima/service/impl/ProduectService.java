package com.itheima.service.impl;

import com.itheima.dao.IProduectDao;
import com.itheima.service.IProduectService;
import com.itheima.entity.Produect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProduectService implements IProduectService {
    @Autowired
    private IProduectDao produectDao;

    @Override
    public Produect getProduectById(Integer pid) throws  RuntimeException{
        return produectDao.findById(pid).get();
    }

    @Override
    public Produect saveProduect(Produect produect) {
        return produectDao.save(produect);
    }
}
