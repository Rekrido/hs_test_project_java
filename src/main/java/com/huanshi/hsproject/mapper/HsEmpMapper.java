package com.huanshi.hsproject.mapper;

import com.huanshi.hsproject.entity.HsEmp;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface HsEmpMapper {

    /**
     * 查询员工信息
     * @return
     */
    List<HsEmp> selectHsEmpList(@Param("empName") String empName,@Param("deptName") String deptName);

    /**
     * 新增员工信息
     * @param emp
     */
    void saveHsEmp(@Param("emp") HsEmp emp);

    /**
     * 修改员工信息
     * @param emp
     */
    void updateHsEmp(@Param("emp") HsEmp emp);

    /**
     * 删除员工信息
     * @param id
     */
    void deleteHsEmp(@Param("id") Integer id);

}
