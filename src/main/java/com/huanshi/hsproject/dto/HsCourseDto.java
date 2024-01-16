package com.huanshi.hsproject.dto;

import com.huanshi.hsproject.entity.HsStu;
import lombok.Data;

import java.util.List;

@Data
public class HsCourseDto {

    private Integer id;

    private String courseName;

    private String teacherName;

    private Integer[] stuIds;

}
