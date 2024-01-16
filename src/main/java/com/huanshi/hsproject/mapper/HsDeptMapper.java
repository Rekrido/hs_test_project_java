package com.huanshi.hsproject.mapper;

import com.huanshi.hsproject.entity.HsDept;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface HsDeptMapper {

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
    void updateHsDept(@Param("dept") HsDept dept);

    /**
     * 删除部门信息
     * @param id
     */
    void deleteHsDept(@Param("id") Integer id);

}
