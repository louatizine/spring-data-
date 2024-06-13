package com.springData.first.data.app.repository;

import com.springData.first.data.app.model.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;



public interface EmpRepo extends JpaRepository<Employee, Integer> {
}

