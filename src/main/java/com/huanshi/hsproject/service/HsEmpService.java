package com.huanshi.hsproject.service;

import com.huanshi.hsproject.entity.HsEmp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface HsEmpService {

    /**
     * 查询员工信息
     * @return
     */
    List<HsEmp> selectHsEmpList(String empName, String deptName);

    /**
     * 新增员工信息
     * @param emp
     */
    void saveHsEmp(HsEmp emp);

    /**
     * 修改员工信息
     * @param emp
     */
    void updateHsEmp(HsEmp emp);

    /**
     * 删除员工信息
     * @param id
     */
    void deleteHsEmp(Integer id);

}
