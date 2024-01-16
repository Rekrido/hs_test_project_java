package com.huanshi.hsproject.controller;

import com.huanshi.hsproject.entity.HsDept;
import com.huanshi.hsproject.service.HsDeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hs/dept")
public class HsDeptController {

    @Autowired
    private HsDeptService hsDeptService;

    @GetMapping("/selectHsDept")
    public List<HsDept> selectHsDept() {
        return hsDeptService.selectHsDept();
    }

    @PostMapping("/saveHsDept")
    public void saveHsDept(@RequestBody HsDept dept) {
        hsDeptService.saveHsDept(dept);
    }

    @PutMapping("/updateHsDept")
    public void updateHsDept(@RequestBody HsDept dept) {
        hsDeptService.updateHsDept(dept);
    }

    @DeleteMapping("/deleteHsDept")
    public void deleteHsDept(Integer id) {
        hsDeptService.deleteHsDept(id);
    }

}
