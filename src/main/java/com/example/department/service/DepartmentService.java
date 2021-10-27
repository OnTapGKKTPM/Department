package com.example.department.service;

import com.example.department.entity.Department;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DepartmentService {
    public Department saveDepartment(Department department);
    public Department getDepartmentById(Long id);
    public List<Department> getDepartmentAll();
    public String deleteDepartment(Long id);
}
