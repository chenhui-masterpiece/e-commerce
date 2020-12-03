package com.gec.gmall.product.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.gec.gmall.product.pojo.PmsBaseCatalog1;
import com.gec.gmall.product.pojo.PmsBaseCatalog2;
import com.gec.gmall.product.service.PmsBaseCatalog1Service;
import com.gec.gmall.product.service.PmsBaseCatalog2Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class PmsBaseCatalog2Controller {

    @Reference
    private PmsBaseCatalog2Service pmsBaseCatalog2Service;

    @RequestMapping("/getCatalog2")
    public List<PmsBaseCatalog2> getCatalog2(Integer catalog1Id)
    {
        return pmsBaseCatalog2Service.getPmsBaseCatalog2(catalog1Id);
    }
}
