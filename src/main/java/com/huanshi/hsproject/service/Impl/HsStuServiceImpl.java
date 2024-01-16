package com.huanshi.hsproject.service.Impl;

import com.huanshi.hsproject.dto.HsStuDto;
import com.huanshi.hsproject.entity.HsStu;
import com.huanshi.hsproject.mapper.HsStuMapper;
import com.huanshi.hsproject.service.HsStuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HsStuServiceImpl implements HsStuService {

    @Autowired
    private HsStuMapper hsStuMapper;

    @Override
    public List<HsStu> selectStuList(String stuName) {
        return hsStuMapper.selectStuList(stuName);
    }

    @Override
    public void saveStu(HsStuDto stu) {
        if (stu.getId() == null) {
            hsStuMapper.saveStu(stu);
        }
        if (stu.getCourseIds() != null && stu.getCourseIds().length > 0) {
            hsStuMapper.saveCourseStu(stu.getId(), stu.getCourseIds());
        }
    }

    @Override
    public void updateStu(HsStu stu) {
        hsStuMapper.updateStu(stu);
    }

    @Override
    public void deleteStu(Integer id) {
        hsStuMapper.deleteStu(id);
    }

    @Override
    public void deleteCourseOfStu(Integer stuId, Integer[] courseIds) {
        hsStuMapper.deleteCourseOfStu(stuId,courseIds);
    }
}
