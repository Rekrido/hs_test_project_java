package com.huanshi.hsproject.service;

import com.huanshi.hsproject.dto.HsStuDto;
import com.huanshi.hsproject.entity.HsStu;

import java.util.List;

public interface HsStuService {
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
     * 删除学生的课程信息
     * @param stuId
     * @param courseIds
     */
    void deleteCourseOfStu(Integer stuId, Integer[] courseIds);
}
