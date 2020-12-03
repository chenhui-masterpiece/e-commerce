package com.gec.gmall.product.service;

import com.gec.gmall.product.pojo.PmsBaseAttrInfo;

import java.util.List;

public interface PmsBaseAttrInfoService {

    public List<PmsBaseAttrInfo> getPmsBaseAttrInfoByCatalog3Id(Integer catalog3Id);

}
