package com.huanshi.hsproject.controller;

import com.huanshi.hsproject.dto.HsCourseDto;
import com.huanshi.hsproject.entity.HsCourse;
import com.huanshi.hsproject.service.HsCourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hs/course")
public class HsCourseController {

    @Autowired
    private HsCourseService hsCourseService;

    @GetMapping("/selectCourseList")
    public List<HsCourse> selectCourseList(String courseName) {
        return hsCourseService.selectCourseList(courseName);
    }

    @PostMapping("/saveCourse")
    public void saveCourse(@RequestBody HsCourseDto course) {
        hsCourseService.saveCourse(course);
    }

    @PutMapping("/updateCourse")
    public void updateCourse(@RequestBody HsCourse course) {
        hsCourseService.updateCourse(course);
    }

    @DeleteMapping("/deleteCourse")
    public void deleteCourse(Integer id) {
        hsCourseService.deleteCourse(id);
    }

    @DeleteMapping("deleteStuOfCourse")
    public void deleteStuOfCourse(Integer courseId, Integer[] stuIds) {
        hsCourseService.deleteStuOfCourse(courseId,stuIds);
    }

    @GetMapping("/addScore")
    public void addScore(Integer courseId, Integer stuId, String score) {
        hsCourseService.addScore(courseId, stuId, score);
    }


}
