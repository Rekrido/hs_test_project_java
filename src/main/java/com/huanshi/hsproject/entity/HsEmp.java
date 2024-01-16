package com.huanshi.hsproject.entity;

import lombok.Data;

import java.util.Date;

@Data
public class HsEmp {

    private Integer id;

    private String empName;

    private String empSex;

    private String empAge;

    private String empPhone;

    private Date createTime;

    private Integer deptId;

    private String deptName;

}
