package com.huanshi.hsproject.service.Impl;

import com.huanshi.hsproject.dto.HsCourseDto;
import com.huanshi.hsproject.entity.HsCourse;
import com.huanshi.hsproject.mapper.HsCourseMapper;
import com.huanshi.hsproject.service.HsCourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import java.util.List;

@Service
public class HsCourseServiceImpl implements HsCourseService {
    @Autowired
    private HsCourseMapper hsCourseMapper;

    @Override
    public List<HsCourse> selectCourseList(String courseName) {
        return hsCourseMapper.selectCourseList(courseName);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void saveCourse(HsCourseDto course) {
        if (course.getId() == null) {
            hsCourseMapper.saveCourse(course);
        }
        if (course.getStuIds() != null && course.getStuIds().length > 0) {
            hsCourseMapper.saveCourseStu(course.getId(), course.getStuIds());
        }

    }

    @Override
    public void updateCourse(HsCourse course) {
        hsCourseMapper.updateCourse(course);
    }

    @Override
    public void deleteCourse(Integer id) {
        hsCourseMapper.deleteCourse(id);
    }

    @Override
    public void deleteStuOfCourse(Integer courseId, Integer[] stuIds) {
        hsCourseMapper.deleteStuOfCourse(courseId, stuIds);
    }

    @Override
    public void addScore(Integer courseId, Integer stuId, String score) {
        hsCourseMapper.addScore(courseId, stuId, score);
    }
}
