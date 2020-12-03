package com.gec.gmall.user.service.impl;

import com.gec.gmall.user.dao.UmsMemberMapper;
import com.gec.gmall.user.pojo.UmsMember;
import com.gec.gmall.user.service.UmsMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@com.alibaba.dubbo.config.annotation.Service
public class UmsMemberServiceImpl implements UmsMemberService {

    @Autowired
    private UmsMemberMapper umsMemberMapper;

    @Override
    public List<UmsMember> getAllUmsMember() {
        return umsMemberMapper.selectAll();
    }
}
