package com.huanshi.hsproject.dto;

import com.huanshi.hsproject.entity.HsCourse;
import lombok.Data;

import java.util.List;

@Data
public class HsStuDto {

    private Integer id;

    private String stuName;

    private Integer stuNo;

    private Integer[] courseIds;
}
