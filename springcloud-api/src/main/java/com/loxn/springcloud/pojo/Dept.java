/*
 * Copyright (C) 2018 Baidu, Inc. All Rights Reserved.
 */
package com.loxn.springcloud.pojo;

/**
 * Created by v_luoxin on 2018-08-02 12:04
 */
public class Dept {
    private String id;
    private String name;
    private String address;

    public Dept(){
    }

    public Dept(String id, String name,String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
