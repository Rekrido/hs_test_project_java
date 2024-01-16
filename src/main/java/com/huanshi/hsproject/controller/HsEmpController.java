package com.huanshi.hsproject.controller;

import com.huanshi.hsproject.entity.HsEmp;
import com.huanshi.hsproject.service.HsEmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hs/emp")
public class HsEmpController {

    @Autowired
    private HsEmpService hsEmpService;

    @GetMapping("/selectHsEmpList")
    public List<HsEmp> selectHsEmpList(String empName, String deptName) {
        return hsEmpService.selectHsEmpList(empName,deptName);
    }

    @PostMapping("/saveHsEmp")
    public void saveHsEmp(@RequestBody HsEmp emp) {
        hsEmpService.saveHsEmp(emp);
    }

    @PutMapping("/updateHsEmp")
    public void updateHsEmp(@RequestBody HsEmp emp) {
        hsEmpService.updateHsEmp(emp);
    }

    @DeleteMapping("/deleteHsEmp")
    public void deleteHsEmp(Integer id) {
        hsEmpService.deleteHsEmp(id);
    }

}
