package com.huanshi.hsproject.service.Impl;

import com.huanshi.hsproject.entity.HsEmp;
import com.huanshi.hsproject.mapper.HsEmpMapper;
import com.huanshi.hsproject.service.HsEmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HsEmpServiceImpl implements HsEmpService {

    @Autowired
    private HsEmpMapper hsEmpMapper;

    @Override
    public List<HsEmp> selectHsEmpList(String empName, String deptName) {
        return hsEmpMapper.selectHsEmpList(empName,deptName);
    }

    @Override
    public void saveHsEmp(HsEmp emp) {
        hsEmpMapper.saveHsEmp(emp);
    }

    @Override
    public void updateHsEmp(HsEmp emp) {
        hsEmpMapper.updateHsEmp(emp);
    }

    @Override
    public void deleteHsEmp(Integer id) {
        hsEmpMapper.deleteHsEmp(id);
    }
}
