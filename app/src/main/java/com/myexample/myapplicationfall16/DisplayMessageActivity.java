package com.myexample.myapplicationfall16;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by 300750088 on 9/9/2016.
 */
public class DisplayMessageActivity extends AppCompatActivity {

    TextView fullName;
    TextView programName;
    TextView semester;
    TextView courseName;

    String fName;
    String pName;
    String sem;
    String crs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        Intent intent = getIntent();
         fName = intent.getStringExtra("fullName");
         pName = intent.getStringExtra("programName");
         sem = intent.getStringExtra("semester");
         crs = intent.getStringExtra("courseName");

    }

    public void loadUI(){
        // Find views from layout
        fullName = (TextView) findViewById(R.id.lbl_full_name);
        programName = (TextView) findViewById(R.id.lbl_program_name);
        semester = (TextView) findViewById(R.id.lbl_semester);
        courseName = (TextView) findViewById(R.id.lbl_course_name);
        // Populate views with intent extras
        fullName.setText(fName);
        programName.setText(pName);
        semester.setText(sem);
        courseName.setText(crs);

    }
}
