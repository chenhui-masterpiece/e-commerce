package com.gec.gmall.product.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.gec.gmall.product.pojo.PmsBaseCatalog1;
import com.gec.gmall.product.service.PmsBaseCatalog1Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
public class PmsBaseCatalog1Controller {

    @Reference
    private PmsBaseCatalog1Service pmsBaseCatalog1Service;

    @RequestMapping("/getCatalog1")
    public List<PmsBaseCatalog1> getCatalog1()
    {
        return pmsBaseCatalog1Service.getPmsBaseCatalog1AllList();
    }
}
