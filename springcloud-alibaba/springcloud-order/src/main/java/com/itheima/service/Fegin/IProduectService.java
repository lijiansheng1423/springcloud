package com.itheima.service.Fegin;

import com.itheima.entity.Produect;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("service-produect")
public interface IProduectService {

    @GetMapping(value="/produect/{pid}")
    Produect getProduect(@PathVariable("pid") Integer id);
}
