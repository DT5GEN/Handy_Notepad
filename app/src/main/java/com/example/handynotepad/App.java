package com.example.handynotepad;

import android.app.Application;
import android.content.Context;

import com.example.handynotepad.data.CacheEmployeeRepositoryImpl;
import com.example.handynotepad.domain.EmployeeRepository;

public class App extends Application {
    private EmployeeRepository employeeRepository = new CacheEmployeeRepositoryImpl();

    @Override
    public void onCreate() {
        super.onCreate();
    }

    public static App get(Context context) {
        return (App) context.getApplicationContext();
    }

    public EmployeeRepository getEmployeeRepo() {
        return employeeRepository;
    }
}