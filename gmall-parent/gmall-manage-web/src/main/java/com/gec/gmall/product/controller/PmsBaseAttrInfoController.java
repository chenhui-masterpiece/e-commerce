package com.gec.gmall.product.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.gec.gmall.product.pojo.PmsBaseAttrInfo;
import com.gec.gmall.product.service.PmsBaseAttrInfoService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class PmsBaseAttrInfoController {

    @Reference
    private PmsBaseAttrInfoService pmsBaseAttrInfoService;

    @RequestMapping("/attrInfoList")
    public List<PmsBaseAttrInfo> attrInfoList(Integer catalog3Id)
    {
        return pmsBaseAttrInfoService.getPmsBaseAttrInfoByCatalog3Id(catalog3Id);
    }
}
