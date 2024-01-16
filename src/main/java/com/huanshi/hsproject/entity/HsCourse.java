package com.huanshi.hsproject.entity;

import lombok.Data;

import java.util.List;

@Data
public class HsCourse {

    private Integer id;

    private String courseName;

    private String teacherName;

    private String score;

    private List<HsStu> stuList;


}
