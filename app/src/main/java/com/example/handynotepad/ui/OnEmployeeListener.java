package com.example.handynotepad.ui;

import com.example.handynotepad.domain.EmployeeEntity;

interface OnEmployeeListener {
    void onDeleteEmployee(EmployeeEntity employeeEntity);
    void onClickEmployee(EmployeeEntity employeeEntity);
}