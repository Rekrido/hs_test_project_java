package com.huanshi.hsproject.entity;

import lombok.Data;

import java.util.List;

@Data
public class HsStu {

    private Integer id;

    private String stuName;

    private Integer stuNo;

    private String score;

    private List<HsCourse> courseList;
}
