package com.example.handynotepad.ui;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.handynotepad.App;
import com.example.handynotepad.R;
import com.example.handynotepad.domain.EmployeeEntity;

public class EmployeeActivity extends AppCompatActivity {
    public static final String EMPLOYEE_EXTRA_KEY = "EMPLOYEE_EXTRA_KEY";
    private TextView nameTextView;
    private Button deleteButton;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee);

        nameTextView = findViewById(R.id.name_text_view);
        EmployeeEntity employeeEntity = getIntent().getParcelableExtra(EMPLOYEE_EXTRA_KEY);
        nameTextView.setText(employeeEntity.getName());

        deleteButton = findViewById(R.id.delete_button);
        deleteButton.setOnClickListener(v -> {
            App.get(this).getEmployeeRepo().deleteEmployee(employeeEntity);
            setResult(RESULT_OK);
            finish();
        });
    }
}