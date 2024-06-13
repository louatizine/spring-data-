package com.springData.first.data.app.service;

import com.springData.first.data.app.model.dto.EmpDto;
import com.springData.first.data.app.model.entity.Employee;
import com.springData.first.data.app.repository.EmpRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Service
public class EmpService {
    @Autowired
    private EmpRepo empRepo;

public EmpDto getUser(Integer id){
    Optional<Employee> emp =this.empRepo.findById(id);
    if (emp.isPresent())
        return EmpDto.toDo(emp.get());
    else
      return null;
}

public  EmpDto sava   (EmpDto e){
    return  EmpDto.toDo(empRepo.save(Employee.toEntity(e)));
}
    public  void delete   (@RequestParam Integer id){
     this.empRepo.deleteById(id);
}



}
