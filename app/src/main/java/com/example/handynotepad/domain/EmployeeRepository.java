package com.example.handynotepad.domain;

import java.util.List;

public interface EmployeeRepository {
    List<EmployeeEntity> getEmployees();

    void deleteEmployee(EmployeeEntity employeeEntity);
}