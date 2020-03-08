package com.itheima.controller;

import com.alibaba.fastjson.JSONObject;
import com.itheima.service.IProduectService;
import com.itheima.service.impl.ProduectService;
import com.itheima.entity.Produect;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
public class ProduectController {
    @Autowired
    private IProduectService produectService;

    @RequestMapping("/produect/{pid}")
    public Produect produect(@PathVariable("pid") Integer pid) {
        log.info("接下来要进行{}号商品的查询", pid);
        Produect produect =produectService.getProduectById(pid);
        log.info("商品查询成功，商品信息{}", JSONObject.toJSONString(produect));
        return  produect;
    }

    @PostMapping("/produect/save")
    public Produect saveProduect(@RequestBody Produect produect) {
        log.info("接下来要进行{}号商品的新增", produect);
        Produect produect1 =produectService.saveProduect(produect);
        log.info("商品查询已保存，商品信息{}", produect1);
        return  produect;
    }
}
