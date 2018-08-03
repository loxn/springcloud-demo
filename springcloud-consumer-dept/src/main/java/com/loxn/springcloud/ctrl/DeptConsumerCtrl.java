/*
 * Copyright (C) 2018 Baidu, Inc. All Rights Reserved.
 */
package com.loxn.springcloud.ctrl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.loxn.springcloud.pojo.Dept;
import com.loxn.springcloud.service.DeptClientService;

/**
 * Created by v_luoxin on 2018-08-02 20:55
 */
@RestController
public class DeptConsumerCtrl {
    @Autowired
    private DeptClientService deptClientService;

    @RequestMapping(value = "/dept/get/{id}", method = RequestMethod.GET)
    public Dept get(@PathVariable("id") long id){
        return deptClientService.get(id);
    }

    @RequestMapping(value = "/dept/list", method = RequestMethod.GET)
    public List<Dept> list(){
        return deptClientService.list();
    }

    @RequestMapping(value = "/dept/add", method = RequestMethod.POST)
    public boolean add(Dept dept){
        return deptClientService.add(dept);
    }
}
