package com.gec.gmall.user.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.gec.gmall.user.pojo.UmsMember;
import com.gec.gmall.user.service.UmsMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
//跨域处理
@CrossOrigin
public class UmsmemberController {

    @Reference
    private UmsMemberService umsMemberService;

    @RequestMapping("/getUmsMemberAllList")
    public List<UmsMember> getUmsMemberAllList()
    {
        return umsMemberService.getAllUmsMember();
    }
}
