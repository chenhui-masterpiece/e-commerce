package com.gec.gmall.product.service.impl;

import com.gec.gmall.product.dao.PmsBaseAttrInfoMapper;
import com.gec.gmall.product.pojo.PmsBaseAttrInfo;
import com.gec.gmall.product.service.PmsBaseAttrInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@com.alibaba.dubbo.config.annotation.Service
public class PmsBaseAttrInfoServiceImpl implements PmsBaseAttrInfoService {

    @Autowired
    private PmsBaseAttrInfoMapper pmsBaseAttrInfoMapper;

    @Override
    public List<PmsBaseAttrInfo> getPmsBaseAttrInfoByCatalog3Id(Integer catalog3Id) {

        PmsBaseAttrInfo pmsBaseAttrInfo=new PmsBaseAttrInfo();
        pmsBaseAttrInfo.setCatalog3Id(catalog3Id);

        return pmsBaseAttrInfoMapper.select(pmsBaseAttrInfo);
    }
}
