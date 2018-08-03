/*
 * Copyright (C) 2018 Baidu, Inc. All Rights Reserved.
 */
package com.loxn.springcloud.dept.ctrl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.loxn.springcloud.pojo.Dept;

/**
 * Created by v_luoxin on 2018-08-02 17:54
 */
@RestController
public class DeptProviderCtrl {

    @RequestMapping(value = "/dept/get/{id}", method = RequestMethod.GET)
    //    @HystrixCommand(fallbackMethod = "processHystrix_Get")
    public Dept get(@PathVariable("id") String id) {
        if ("999".equals(id)) {
            throw new RuntimeException("找不到id为：" + id + "的记录");
        }
        return new Dept(id, "老王", "8002");
    }

    @RequestMapping(value = "/dept/list", method = RequestMethod.GET)
    public List<Dept> list() {
        List<Dept> list = new ArrayList<>();
        list.add(new Dept("1", "老罗", "北京"));
        list.add(new Dept("2", "史强", "郑州"));
        list.add(new Dept("3", "老孙", "西安"));
        return list;
    }

    @RequestMapping(value = "/dept/add", method = RequestMethod.POST)
    public boolean add(Dept dept) {
        return true;
    }

    //    public Dept processHystrix_Get(@PathVariable("id") String id) {
    //        return new Dept("2333","haha",null);
    //    }
}
