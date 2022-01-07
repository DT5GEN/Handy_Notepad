package com.example.handynotepad.data;

import java.util.ArrayList;
import java.util.List;

import com.example.handynotepad.domain.EmployeeEntity;
import com.example.handynotepad.domain.EmployeeRepository;

public class WebEmployeeRepositoryImpl implements EmployeeRepository {

    // todo Здесь надо получать данные из интернета

    @Override
    public List<EmployeeEntity> getEmployees() {
        return new ArrayList<>();
    }

    @Override
    public void deleteEmployee(EmployeeEntity employeeEntity) {
        // todo ignore
    }
}