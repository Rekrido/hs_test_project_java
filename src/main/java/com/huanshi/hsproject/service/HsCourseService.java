package com.huanshi.hsproject.service;

import com.huanshi.hsproject.dto.HsCourseDto;
import com.huanshi.hsproject.entity.HsCourse;

import java.util.List;

public interface HsCourseService {
    /**
     * 查询课程相关信息
     * @return
     */
    List<HsCourse> selectCourseList(String courseName);

    /**
     * 新增课程
     * @param course
     */
    void saveCourse(HsCourseDto course);

    /**
     * 修改课程
     * @param course
     */
    void updateCourse(HsCourse course);

    /**
     * 删除课程
     * @param id
     */
    void deleteCourse(Integer id);

    /**
     * 删除课程中的学生信息
     * @param courseId
     * @param stuIds
     */
    void deleteStuOfCourse(Integer courseId, Integer[] stuIds);

    /**
     * 添加成绩
     * @param courseId
     * @param stuId
     * @param score
     */
    void addScore(Integer courseId, Integer stuId, String score);
}
