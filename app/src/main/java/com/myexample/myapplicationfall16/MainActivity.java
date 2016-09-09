package com.myexample.myapplicationfall16;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText fullName;
    EditText programName;
    EditText semester;
    EditText courseName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart(){
        super.onStart();
        loadUI();
    }

    public void sendMessage(View view){
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        String fName = fullName.getText().toString();
        String pName = programName.getText().toString();
        String sem = semester.getText().toString();
        String crs = courseName.getText().toString();
        intent.putExtra("fullName", fName);
        intent.putExtra("programName", pName);
        intent.putExtra("semester", sem);
        intent.putExtra("courseName", crs);
        startActivity(intent);
    }

    public void loadUI(){
        fullName = (EditText) findViewById(R.id.full_name);
        programName = (EditText) findViewById(R.id.program_name);
        semester = (EditText) findViewById(R.id.semester);
        courseName = (EditText) findViewById(R.id.course_name);
    }
}
