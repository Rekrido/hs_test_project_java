package com.huanshi.hsproject.controller;

import com.huanshi.hsproject.dto.HsStuDto;
import com.huanshi.hsproject.entity.HsStu;
import com.huanshi.hsproject.service.HsStuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hs/stu")
public class HsStuController {

    @Autowired
    private HsStuService hsStuService;

    @GetMapping("/selectStuList")
    public List<HsStu> selectStuList(String stuName) {
        return hsStuService.selectStuList(stuName);
    }

    @PostMapping("/saveStu")
    public void saveStu(@RequestBody HsStuDto stu){
        hsStuService.saveStu(stu);
    }

    @PutMapping("/updateStu")
    public void updateStu(@RequestBody HsStu stu) {
        hsStuService.updateStu(stu);
    }

    @DeleteMapping("/deleteStu")
    public void deleteStu(Integer id) {
        hsStuService.deleteStu(id);
    }

    @DeleteMapping("/deleteCourseOfStu")
    public void deleteCourseOfStu(Integer stuId, Integer[] courseIds) {
        hsStuService.deleteCourseOfStu(stuId, courseIds);
    }

}
