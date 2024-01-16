package com.huanshi.hsproject.service.Impl;

import com.huanshi.hsproject.entity.HsDept;
import com.huanshi.hsproject.mapper.HsDeptMapper;
import com.huanshi.hsproject.service.HsDeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HsDeptServiceImpl implements HsDeptService {

    @Autowired
    private HsDeptMapper hsDeptMapper;

    @Override
    public List<HsDept> selectHsDept() {
        return hsDeptMapper.selectHsDept();
    }

    @Override
    public void saveHsDept(HsDept dept) {
        hsDeptMapper.saveHsDept(dept);
    }

    @Override
    public void updateHsDept(HsDept dept) {
        hsDeptMapper.updateHsDept(dept);
    }

    @Override
    public void deleteHsDept(Integer id) {
        hsDeptMapper.deleteHsDept(id);
    }
}
