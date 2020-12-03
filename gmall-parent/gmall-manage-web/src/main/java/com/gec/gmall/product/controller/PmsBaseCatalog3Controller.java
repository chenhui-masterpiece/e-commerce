package com.gec.gmall.product.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.gec.gmall.product.pojo.PmsBaseCatalog2;
import com.gec.gmall.product.pojo.PmsBaseCatalog3;
import com.gec.gmall.product.service.PmsBaseCatalog2Service;
import com.gec.gmall.product.service.PmsBaseCatalog3Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class PmsBaseCatalog3Controller {

    @Reference
    private PmsBaseCatalog3Service pmsBaseCatalog3Service;

    @RequestMapping("/getCatalog3")
    public List<PmsBaseCatalog3> getCatalog3(Integer catalog2Id)
    {
        return pmsBaseCatalog3Service.getPmsBaseCatalog3(catalog2Id);
    }
}
