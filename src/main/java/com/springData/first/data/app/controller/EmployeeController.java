package com.springData.first.data.app.controller;

import com.springData.first.data.app.model.dto.EmpDto;
import com.springData.first.data.app.model.entity.Employee;
import com.springData.first.data.app.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    @Autowired
    private EmpService empService;

    @GetMapping("/get-emp")
    public EmpDto getUser(@RequestParam Integer id) {
        return empService.getUser(id);
    }

    @PostMapping("/save-emp")
    public EmpDto save(@RequestBody EmpDto employee) {
        return empService.sava(employee);
    }
    @PostMapping("/update-emp")
    public EmpDto update (@RequestBody EmpDto employee) {
        return empService.sava(employee);
    }

    @GetMapping("/delete-emp")
    public void delete(@RequestParam Integer id) {
        empService.delete(id);
    }
}
