package com.huanshi.hsproject.entity;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class HsDept {

    private Integer id;

    private String deptName;

    private Date createTime;

    private List<HsEmp> empList;

}
