package com.example.department.service;

import com.example.department.entity.Department;
import com.example.department.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class DepartmentServiceImpl implements DepartmentService{
    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public Department saveDepartment(Department department) {
        log.info("Connect Save Function");
        return departmentRepository.save(department);
    }

    @Override
    public Department getDepartmentById(Long id) {
        log.info("Connect GetByID Function");
        Department department= departmentRepository.findById(id).get();
        return department;
    }

    @Override
    public List<Department> getDepartmentAll() {
        log.info("Connect GetAll Function");
        List<Department> list = departmentRepository.findAll();
        return list;
    }

    @Override
    public String deleteDepartment(Long id) {
        log.info("Connect Delete Function");
        Department department= departmentRepository.findById(id).get();
        if (department != null) {
            departmentRepository.delete(department);
            return "Delete Successfully";
        } else {
            return "Delete Fail";
        }
    }
}
