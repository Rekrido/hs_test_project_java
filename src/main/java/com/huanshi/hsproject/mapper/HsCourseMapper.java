package com.huanshi.hsproject.mapper;

import com.huanshi.hsproject.dto.HsCourseDto;
import com.huanshi.hsproject.entity.HsCourse;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface HsCourseMapper {

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
     * 添加课程与学生相关信息
     * @param courseId
     * @param stuIds
     */
    void saveCourseStu(@Param("courseId") Integer courseId, @Param("stuIds") Integer[] stuIds);

    /**
     * 删除课程中的学生信息
     * @param courseId
     * @param stuIds
     */
    void deleteStuOfCourse(@Param("courseId") Integer courseId,@Param("stuIds") Integer[] stuIds);

    /**
     * 添加成绩
     * @param courseId
     * @param stuId
     * @param score
     */
    void addScore(@Param("courseId") Integer courseId,@Param("stuId") Integer stuId,@Param("score") String score);
}
