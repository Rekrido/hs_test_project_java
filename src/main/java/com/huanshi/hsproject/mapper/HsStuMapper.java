package com.huanshi.hsproject.mapper;

import com.huanshi.hsproject.dto.HsStuDto;
import com.huanshi.hsproject.entity.HsStu;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface HsStuMapper {

    /**
     * 查询学生信息
     * @return
     */
    List<HsStu> selectStuList(String stuName);

    /**
     * 新增学生信息
     * @param stu
     */
    void saveStu(HsStuDto stu);

    /**
     * 修改学生信息
     * @param stu
     */
    void  updateStu(HsStu stu);

    /**
     * 删除学生信息
     * @param id
     */
    void deleteStu(Integer id);

    /**
     * 添加课程与学生相关信息
     * @param stuId
     * @param courseIds
     */
    void saveCourseStu(@Param("stuId") Integer stuId, @Param("courseIds") Integer[] courseIds);

    /**
     * 删除学生的课程信息
     * @param stuId
     * @param courseIds
     */
    void deleteCourseOfStu(@Param("stuId") Integer stuId,@Param("courseIds") Integer[] courseIds);
}
