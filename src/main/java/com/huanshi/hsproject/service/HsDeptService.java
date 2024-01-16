package com.huanshi.hsproject.service;

import com.huanshi.hsproject.entity.HsDept;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface HsDeptService {

    /**
     * 查询部门信息
     * @return
     */
    List<HsDept> selectHsDept();

    /**
     * 新增部门信息
     * @param dept
     */
    void saveHsDept(HsDept dept);

    /**
     * 修改部门信息
     * @param dept
     */
    void updateHsDept(HsDept dept);

    /**
     * 删除部门信息
     * @param id
     */
    void deleteHsDept(Integer id);

}
